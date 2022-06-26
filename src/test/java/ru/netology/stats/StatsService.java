package ru.netology.stats;

public class StatsService {
    // Сумма всех продаж
    public int calculateOfSales(int[] sales) {
        int amountSales = 0;
        for (int i = 0; i < sales.length; i++) {
            amountSales = amountSales + sales[i];
        }
        return amountSales;
    }

    // Средняя сумма продаж в месяц
    public int calculateAverageAmount(int[] sales) {
        int amountSales = calculateOfSales(sales);
        int averageAmount = amountSales / sales.length;
        return averageAmount;
    }

    // Месяц минимальных продаж
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

    // Месяц максимальных продаж
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
    // минимальные продажи
    public int counterSalesBelowAverage(int[] sales) {
        int averageAmount = calculateAverageAmount(sales);
        int numberMonth = 0;
        for (int sale : sales) {
            if (sale < averageAmount) {
                numberMonth++;
            }
        }
        return numberMonth;
    }
    // максимальные продажи
    public int counterSalesAreAboveAverage(int[] sales) {
        int averageAmount = calculateAverageAmount(sales);
        int numberMonth = 0;
        for (int sale : sales) {
            if (sale > averageAmount) {
                numberMonth++;
            }
        }
        return numberMonth;
    }
}