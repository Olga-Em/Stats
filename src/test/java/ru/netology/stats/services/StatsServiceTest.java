package ru.netology.stats.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void noSalesOneMonth() {
        StatsService service = new StatsService();

        int[] monthSale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 0};

        int expect = 162;
        int actual = service.amountSales(monthSale);

        Assertions.assertEquals(expect, actual);
    }

    @Test
    public void shouldCountForSixMonths() {
        StatsService service = new StatsService();

        int[] monthSale = {8, 15, 13, 15, 17, 20};

        int expect = 14;
        int actual = service.averageSale(monthSale);

        Assertions.assertEquals(expect, actual);
    }

    @Test
    public void severalMaxSalesMonth() {
        StatsService service = new StatsService();

        int[] monthSale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expect = 8;
        int actual = service.maxSales(monthSale);

        Assertions.assertEquals(expect, actual);
    }

    @Test
    public void negativeMinSalesMonth() {
        StatsService service = new StatsService();

        int[] monthSale = {8, 15, 13, 15, 17, 20, -19, 20, 7, 14, 14, 18};

        int expect = 7;
        int actual = service.minSales(monthSale);

        Assertions.assertEquals(expect, actual);
    }

    @Test
    public void sameAverage() {
        StatsService service = new StatsService();

        int[] monthSale = {8, 15, 13, 15, 15, 20, 19, 20, 7, 14, 14, 18};

        int expect = 3;
        int actual = service.belowAverage(monthSale);

        Assertions.assertEquals(expect, actual);
    }

    @Test
    public void someRevenueForMonths() {
        StatsService service = new StatsService();

        int[] monthSale = {15, 15, 15};

        int expect = 0;
        int actual = service.aboveAverage(monthSale);

        Assertions.assertEquals(expect, actual);
    }
}
