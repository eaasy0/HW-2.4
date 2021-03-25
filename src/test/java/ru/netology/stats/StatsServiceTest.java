package ru.netology.stats;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    @Test
    void SalesSum() {
        int sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 180;
        int actual = service.salesSum(sales);
        assertEquals(expected, actual);
    }

    @Test
    void AverageSales() {
        int sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 15;
        int actual = service.salesAverage(sales);
        assertEquals(expected, actual);
    }

    @Test
    void SalesMax() {
        int sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 8;
        int actual = service.salesMax(sales);
        assertEquals(expected, actual);
    }

    @Test
    void SalesMin() {
        int sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 9;
        int actual = service.salesMin(sales);
        assertEquals(expected, actual);
    }
    @Test
    void salesAboveAverage() {
        int sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.salesAboveAverage(sales);
        assertEquals(expected, actual);}


    @Test
    void salesBelowAverage() {
        int sales[] = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        StatsService service = new StatsService();
        int expected = 5;
        int actual = service.salesBelowAverage(sales);
        assertEquals(expected, actual);}
}