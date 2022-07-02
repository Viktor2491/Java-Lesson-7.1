package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {

    @Test
    public void shouldCalculateAmountSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAmount = 180;
        int actualAmount = service.calculateOfSales(sales);
        assertEquals(expectedAmount, actualAmount);
        System.out.println("Сумма продаж :" + actualAmount);
    }

    @Test
    public void shouldCalculateAverageAmount() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAverageAmount = 15;
        int actualAverageAmount = service.calculateAverageAmount(sales);
        assertEquals(expectedAverageAmount, actualAverageAmount);
        System.out.println("Средняя сумма продаж в месяц :" + actualAverageAmount);

    }

    @Test
    public void shouldFindMinAmountSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedNumberMonth = 9;
        int actualNumberMonth = service.minSales(sales);
        assertEquals(expectedNumberMonth, actualNumberMonth);
        System.out.println("Месяц минимальных продаж :" + actualNumberMonth);

    }
    @Test
    public void shouldFindMaxAmountSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedNumberMonth = 8;
        int actualNumberMonth = service.maxSales(sales);
        assertEquals(expectedNumberMonth, actualNumberMonth);
        System.out.println("Месяц максимальных продаж :" + actualNumberMonth);

    }
    @Test
    public void CounterOfMonthsOfLowSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAverageAmount = 5;
        int actualAverageAmount = service.counterSalesBelowAverage(sales);
        assertEquals(expectedAverageAmount, actualAverageAmount);
        System.out.println("Кол-во месяцев, в которых продажи были ниже среднего :" + actualAverageAmount);

    }
    @Test
    public void CounterOfMonthsOfHighSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedAverageAmount = 5;
        int actualAverageAmount = service.counterSalesAreAboveAverage(sales);
        assertEquals(expectedAverageAmount, actualAverageAmount);
        System.out.println("Кол-во месяцев, в которых продажи были выше среднего :" + actualAverageAmount);

    }
}
