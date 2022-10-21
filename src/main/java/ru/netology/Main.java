package ru.netology;

import ru.netology.stats.services.StatsService;

public class Main {
    public static void main(String[] args) {

        StatsService service = new StatsService();

        int[] monthSale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int sumSales = service.amountSales(monthSale);
        int averageSale = service.averageSale(monthSale);
        int maxSales = service.maxSales(monthSale);
        int minSales = service.minSales(monthSale);
        int belowAverage = service.belowAverage(monthSale);
        int aboveAverage = service.aboveAverage(monthSale);

        System.out.println(sumSales);
        System.out.println(averageSale);
        System.out.println(maxSales);
        System.out.println(minSales);
        System.out.println(belowAverage);
        System.out.println(aboveAverage);
    }
}