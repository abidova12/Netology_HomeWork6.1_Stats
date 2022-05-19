package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {


    @Test
    public void SumSalesTest() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.sumSales(sales);
        int expected = 180;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageSumSalesTest() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.averageSumSales(sales);
        int expected = 15;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minSalesTest() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.minSales(sales);
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxSalesTest() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.maxSales(sales);
        int expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void underAverageSalesTest() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int averageSumSales = 15;

        int actual = service.underAverageSales(sales, averageSumSales);
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void overAverageSalesTest() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int averageSumSales = 15;

        int actual = service.overAverageSales(sales, averageSumSales);
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }
}
