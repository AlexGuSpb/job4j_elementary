package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double subAndShare(double first, double second) {
        return sub(first, second) + share(first, second);
    }

    public static double sumAndMultiplyAndSubAndShare(double first, double second) {
        return sum(first, second) + multiply(first, second) + sub(first, second) + share(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + subAndShare(10, 5));
        //System.out.println("Результат расчета равен: " + (sumAndMultiply(10, 20) + subAndShare(10, 5)));
        System.out.println("Результат расчета равен: " + sumAndMultiplyAndSubAndShare(50, 25));
    }
}