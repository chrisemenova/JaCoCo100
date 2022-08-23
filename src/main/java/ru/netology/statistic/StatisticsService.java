package ru.netology.statistic;

public class StatisticsService {
    /**
     * Calculate index of max income
     *
     * @param incomes - array of incomes    //массив прибылей
     * @return - index of first max value    //первая макс стоимость
     */
    public long findMax(long[] incomes) {
        long current_max_index = 0;
        long current_max = incomes[0];       //каррент макс = нулевой ячейке массива incomes
        for (long income : incomes)
            if (current_max < income)
                current_max = income;
        return current_max;
    }
}