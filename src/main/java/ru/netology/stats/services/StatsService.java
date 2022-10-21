package ru.netology.stats.services;

public class StatsService {
    public int amountSales(int[] sales) {
        int sumSales = 0;

        for (int i = 0; i < sales.length; i++) {
            sumSales = sumSales + sales[i];
        }
        return sumSales;
    }

    public int averageSale(int[] sales) {
        int average = amountSales(sales) / sales.length;
        return average;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;

        for (int max : sales) {
            if (max >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;

        for (int max : sales) {
            if (max <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int belowAverage(int[] sales) {
        int average = averageSale(sales);
        int worstMonths = 0;

        for (int a = 0; a < sales.length; a++) {
            if (sales[a] < average) {
                worstMonths = worstMonths + 1;
            }
        }
        return worstMonths;
    }

    public int aboveAverage(int[] sales) {
        int average = averageSale(sales);
        int bestMonths = 0;

        for (int b = 0; b < sales.length; b++) {
            if (sales[b] > average) {
                bestMonths = bestMonths + 1;
            }
        }
        return bestMonths;
    }

}
