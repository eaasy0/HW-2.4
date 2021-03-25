package ru.netology.stats;

public class StatsService {
    public static int salesSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sale + sum;
        }
        return sum;
    }

    public static int salesAverage(int[] sales) {
        int sum = salesSum(sales);
        int average = sum / sales.length;
        return average;
    }

    public static int salesMax(int[] sales) {
        int max = maximumSales(sales);
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] == max) {
                month = i;
            }
        }
        return month + 1;

    }

    public static int maximumSales(int[] sales) {
        int max = sales[0];
        for (int i : sales) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }




    public static int salesMin(int[] sales) {
        int min = salesMinimum(sales);
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] == min) {
                month = i;
            }
        }
        return month + 1;
    }
        public static int salesMinimum(int[] sales) {
            int min = sales[0];
            for (int i : sales) {
                if (i < min) {
                    min = i;
                }
            }
            return min;
        }



        public static int salesBelowAverage(int[] sales) {
        int average = salesAverage(sales);
        int months = 0;
        for (int sale : sales) {
            if (sale < average) {
                months = months + 1;
            }
        }
        return months;
    }

    public static int salesAboveAverage(int[] sales) {
        int avg = salesAverage(sales);
        int months = 0;
        for (int num : sales) {
            if (num > avg) {
                months = months + 1;
            }
        }
        return months;
    }
}

