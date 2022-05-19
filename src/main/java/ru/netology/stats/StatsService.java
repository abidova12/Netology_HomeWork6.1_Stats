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
            averageSum += sale;
        }
        return averageSum / 12;
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
        int underAverageMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale < averageSumSales) {
                underAverageMonth = month + 1;
                month++;
            }
        }
        return underAverageMonth;
    }

    public int overAverageSales(long[] sales, int averageSumSales) {
        int overAverageMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale > averageSumSales) {
                overAverageMonth = month + 1;
                month++;
            }
        }
        return overAverageMonth;
    }
}