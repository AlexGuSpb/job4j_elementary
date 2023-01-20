package ru.job4j.condition;

public class LogicNot {

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return !isPositive(num);
    }

    public static boolean notEvenAndPositive(int num) {
        return !notEven(num) && !notPositive(num);
    }

    public static boolean evenOrNotPositive(int num) {
        return isEven(num) && !notPositive(num);
    }

    public static void main(String[] args) {
        boolean resultIsEven = isEven(10);
        System.out.println(resultIsEven);
        boolean resultIsPositive = isPositive(2);
        System.out.println(resultIsPositive);
        boolean resultNotEven = notEven(3);
        System.out.println(resultNotEven);
        boolean resultNotPositive = notPositive(-1);
        System.out.println(resultNotPositive);
        boolean resultNotEvenAndPositive = notEvenAndPositive(2);
        System.out.println(resultNotEvenAndPositive);
        boolean resultEvenOrNotPositive = evenOrNotPositive(-2);
        System.out.println(resultNotEvenAndPositive);
    }
}
