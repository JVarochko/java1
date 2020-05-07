package ru.progwards.java1.lessons.compare_if_cycles;

import org.w3c.dom.ls.LSOutput;

public class TriangleSimpleInfo {

    final static int a = 4;
    final static int b = 8;
    final static int c = 9;

    public static void main(String[] args) {
        ru.progwards.java1.lessons.compare_if_cycles.TriangleSimpleInfo.minSide(a, b, c);
        ru.progwards.java1.lessons.compare_if_cycles.TriangleSimpleInfo.maxSide(a, b, c);
        ru.progwards.java1.lessons.compare_if_cycles.TriangleSimpleInfo.isEquilateralTriangle(a, b, c);

    }
    public static int maxSide(int a, int b, int c) {
        int max = 9;
        if (a > b) {
            max = a;
        if (b > a)
            max = b;
        if (c > max)
            max = c;
        }
        System.out.println("Наибольшее число " + max);
        return max;
    }

    public static int minSide(int a, int b, int c) {

        int min = 0;
        if (a < b) {
            min = a;
        if (b < a)
            min = b;
        if (c < min)
            min = c;
        }
        System.out.println("Наименьшее число " + min);
        return min;
    }

    public static boolean isEquilateralTriangle(int a, int b, int c) {
        boolean result1 = a == b & b == c;
        boolean result2 = a != b & b != c;
        System.out.println("треугольник равносторонний " + result1);
        System.out.println("треугольник разносторонний " + result2);
        return false;


    }
}





