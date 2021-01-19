package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int calculateAverageSum(int[] sales) {
        int averageSum = calculateSum(sales) / sales.length;

        return averageSum;
    }

    public int numberMonthWithMaxSales(int[] sales) {
        int currentMax = sales[0];
        int month = 0;
        int monthMaxSales = 0;
        for (int sale : sales) {
            month++;
            if (currentMax <= sale) {
                currentMax = sale;
                monthMaxSales = month;
            }
        }
        return monthMaxSales;
    }

    public int numberMonthWithMinSales(int[] sales) {
        int currentMin = sales[0];
        int month = 0;
        int monthMinSales = 0;
        for (int sale : sales) {
            month++;
            if (currentMin >= sale) {
                currentMin = sale;
                monthMinSales = month;
            }
        }
        return monthMinSales;
    }

    public int quantityMonthsWithSalesUnderAverage(int[] sales) {
        int averageSum = calculateAverageSum(sales);
        int monthsUnderAverage = 0;
        for (int sale : sales) {
            if (sale < averageSum) {
                monthsUnderAverage++;
            }
        }
        return monthsUnderAverage;
    }

    public int quantityMonthsWithSalesOverAverage(int[] sales) {
        int averageSum = calculateAverageSum(sales);
        int monthsOverAverage = 0;
        for (int sale : sales) {
            if (sale > averageSum) {
                monthsOverAverage++;
            }
        }
        return monthsOverAverage;
    }
}