package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double delAndMinus(double first, double second) {
        return del(first, second)
                + minus(first, second);
    }

    public static double sumAndMultiplyAndminusAnddel(double first, double second) {
        return sum(first, second)
                + multiply(first, second) + minus(first, second) + del(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + delAndMinus(10, 20));
        System.out.println("Результат расчета равен: " + sumAndMultiplyAndminusAnddel(10, 20));
    }
}
