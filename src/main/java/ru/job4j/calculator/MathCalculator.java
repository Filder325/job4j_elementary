package ru.job4j.calculator;

import ru.job4j.math.MathFunction;
public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return MathFunction.sum(first, second)
                + MathFunction.multiply(first, second);
    }

    public static double delAndMinus(double first, double second) {
        return MathFunction.del(first, second)
                + MathFunction.minus(first, second);
    }

    public static double sumAndMultiplyAndminusAnddel(double first, double second) {
        return MathFunction.sum(first, second)
                + MathFunction.multiply(first, second) + MathFunction.minus(first, second) + MathFunction.del(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + delAndMinus(10, 20));
        System.out.println("Результат расчета равен: " + sumAndMultiplyAndminusAnddel(10, 20));
    }
}
