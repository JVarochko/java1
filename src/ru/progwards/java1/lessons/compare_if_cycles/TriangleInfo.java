package ru.progwards.java1.lessons.compare_if_cycles;
public class TriangleInfo {

    public static void main(String[] args) {
        isTriangle(3, 6, 8);
        System.out.println(isTriangle(3, 6, 8));
        isRightTriangle(3, 6, 8);
        System.out.println(isRightTriangle(3, 6, 8));
        isIsoscelesTriangle(3, 6, 8);
        System.out.println(isIsoscelesTriangle(3, 6, 8));
    }

    public static boolean isTriangle(int a, int b, int c) {
        boolean result = ((a + b) > c && (a + c) > b && (b + c) > a);
        return result;
    }

    public static boolean isRightTriangle(int a, int b, int c) {

        boolean result = (a * a) + (b * b) == (c * c) | (a * a) + (c * c) == (b * b) | (b * b) + (c * c) == (a * a);
        return result;
    }

    public static boolean isIsoscelesTriangle(int a, int b, int c) {
        boolean result = (a == b) | (b == c) | (a == c);
        return result;

    }

}




