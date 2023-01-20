package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int summation(int first, int second) {
        return first + second;
    }

    public static void main(String[] args) {
        int maximum = Max.max(10, 5);
        System.out.println(maximum);
        int sum = Max.summation(10, 5);
        System.out.println(sum);
    }
}