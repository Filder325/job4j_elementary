package ru.job4j.math;
import static ru.job4j.math.MathFunction.*;
public class MathCalcultion {
    public static double a1(double first, double second) {
        return min(first, second) + del(first, second);
    }
    public static double a2(double first, double second) {
        return min(first, second) + del(first, second) + sum(first, second) + multiply(first, second);
    }
    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + a1(10, 20));
        System.out.println("Результат расчета равен: " + a2(10, 20));
    }
}

