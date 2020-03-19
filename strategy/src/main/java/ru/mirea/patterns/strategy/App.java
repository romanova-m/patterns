package ru.mirea.patterns.strategy;

import ru.mirea.patterns.strategy.behaviours.DoSelf;
import ru.mirea.patterns.strategy.behaviours.DontPrepare;

/**
 * Паттерн Стратегия определяет семейство алгоритмов,
 * инкапсулирует каждый из них и обеспечивает их взаимозаменяемость.
 * Он позволяет модифицировать алгоритмы независимо
 * от их использования на стороне клиента.
 */
public class App {
    public static void main(String[] args) {
        HomeworkStrategy strategy = new HomeworkStrategy(new DontPrepare(), new DoSelf());
        strategy.prepare();
        strategy.doHomework();
    }
}
