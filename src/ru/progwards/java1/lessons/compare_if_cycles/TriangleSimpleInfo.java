package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleSimpleInfo {


    public static void main(String[] args) {
        maxSide(1, 5, 5);
        System.out.println(maxSide(1, 5, 5));
        minSide(1, 5, 5);
        System.out.println(minSide(1, 5, 5));
        isEquilateralTriangle(1,5,5);
        System.out.println(isEquilateralTriangle(1,5,5));
    }
    public static int maxSide(int a, int b, int c) {

        if (a >= b && a >= c) {
            return a;
        }
        if (b >= a && b >= c) {
            return b;
        }
        return c;
        }


    public static int minSide(int a, int b, int c) {

        if (a <= b && a <= c) {
            return a;
        }
        if (b <= a && b <= c) {
            return b;
        }
        return c;
        }


    public static boolean isEquilateralTriangle(int a, int b, int c) {

        boolean result = a == b && b == c;
        return result;
        }

    }






