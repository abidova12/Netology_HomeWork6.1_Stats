package ru.netology.stats;

public class StatsService {


    public int sumSales(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int averageSumSales(long[] sales) {
        int averageSum = 0;
        for (long sale : sales) {
            averageSum = sumSales(sales) / sales.length;
        }
        return averageSum;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int underAverageSales(long[] sales, int averageSumSales) {
        int underAverageMonths = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSumSales) {
                underAverageMonths = underAverageMonths + 1;
            }
        }
        return underAverageMonths;
    }

    public int overAverageSales(long[] sales, int averageSumSales) {
        int overAverageMonths = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSumSales) {
                overAverageMonths = overAverageMonths + 1;
            }
        }
        return overAverageMonths;
    }
}