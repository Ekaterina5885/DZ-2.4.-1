package ru.netology.stats;

public class StatsService {
    public int sumAllSales(int[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int averageSales(int[] sales) {
        int averageAmount = 0;
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        averageAmount = sum / sales.length;

        return averageAmount;
    }

    public int maxSales(int[] sales) {
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

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int monthBelowAverage(int[] sales) {

        int averageAmount = 0;
        int sum = 0;
        int numberOfMonths = 0;

        for (int sale : sales) {
            sum += sale;
        }
        averageAmount = sum / sales.length;

        for (int sale : sales) {
            if (sale < averageAmount) {
                numberOfMonths++;
            }
        }
        return numberOfMonths;
    }

    public int monthAboveAverage(int[] sales) {

        int averageAmount = 0;
        int sum = 0;
        int numberOfMonths = 0;

        for (int sale : sales) {
            sum += sale;
        }
        averageAmount = sum / sales.length;

        for (int sale : sales) {
            if (sale > averageAmount) {

                numberOfMonths++;
            }
        }
        return numberOfMonths;
    }
}
