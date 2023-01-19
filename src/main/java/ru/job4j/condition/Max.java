package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static boolean maxx(int left, int right) {
        boolean result = left > right ? true : false;
        return result;
    }

    public static int summation(int first, int second) {
        int result = first + second;
        return result;
    }

    public static void main(String[] args) {
        int maximum = Max.max(10, 5);
        System.out.println(maximum);
        int sum = Max.summation(10, 5);
        System.out.println(sum);
        boolean answer = Max.maxx(10, 5);
        System.out.println(answer);
    }
}