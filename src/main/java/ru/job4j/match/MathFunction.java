package ru.job4j.match;
import static ru.job4j.math.MathFunction.*;
public class MathFunction {
    public static double sum(double first, double second) {
        return first + second;
    }
    public static double min(double first, double second) {
        return first - second;
    }
    public static double del(double first, double second) {
        return first / second;
    }
    public static double multiply(double first, double second) {
        return first * second;
    }
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }
    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));

    }
}
