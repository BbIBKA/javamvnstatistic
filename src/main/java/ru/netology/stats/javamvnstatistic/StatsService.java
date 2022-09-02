package ru.netology.stats.javamvnstatistic;

public class StatsService {
    public int salesTotal(int[] sales) {
        int sumSales = 0;
        for (int i = 0; i < sales.length; i++) {
            sumSales = sumSales + sales[i];
        }
        return sumSales;
    }

    public int salesAverage(int[] sales) {
        int averageSales = salesTotal(sales);
        int quantity = sales.length;
        averageSales = averageSales / quantity;
        return averageSales;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
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

    public int minAverage(int[] sales) {
        int average = salesAverage(sales); //средняя сумма продаж
        int monthTotal = 0;  //переменная для количества месяцев с продажами ниже средних
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                monthTotal++;
            }
            ;
        }
        return monthTotal;
    }

    public int maxAverage(int[] sales) {
        int average = salesAverage(sales); //средняя сумма продаж
        int monthTotal = 0;  //переменная для количества месяцев с продажами выше средних
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                monthTotal++;
            }
            ;
        }
        return monthTotal;
    }
}

