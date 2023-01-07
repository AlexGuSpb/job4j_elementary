package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double a = x2 - x1;
        double b = y2 - y1;
        double c = Math.pow(a, 2);
        double d = Math.pow(b, 2);
        double e = c + d;
        double rsl = Math.sqrt(e);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        double result2 = Point.distance(0, 0, 2, 2);
        double result3 = Point.distance(1, 1, 2, 2);
        System.out.println("result (0, 0) to (2, 0) " + result);
        System.out.println("result (0, 0) to (2, 2) " + result2);
        System.out.println("result (1, 1) to (2, 2) " + result3);
    }
}
