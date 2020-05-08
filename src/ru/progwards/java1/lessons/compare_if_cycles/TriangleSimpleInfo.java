package ru.progwards.java1.lessons.compare_if_cycles;



public class TriangleSimpleInfo {
    final static int a = 5;
    final static int b = 3;
    final static int c = 4;


    public static void main(String[] args) {
  ru.progwards.java1.lessons.compare_if_cycles.TriangleSimpleInfo.maxSide(a, b, c);
  ru.progwards.java1.lessons.compare_if_cycles.TriangleSimpleInfo.minSide(a, b, c);
  ru.progwards.java1.lessons.compare_if_cycles.TriangleSimpleInfo.isEquilateralTriangle(a, b, c);


    }
    public static int maxSide(int a, int b, int c) {
//         a = 5;
//         b = 3;
//         c = 4;

        if (a > b && a > c) {
            System.out.println("maxSide" + a);
        }
        if (b > a && b > c) {
                System.out.println("maxSide" + b);
        }
        if (c > a && c > b) {
            System.out.println("maxSide" + c);
        }
        return a;
    }

    public static int minSide(int a, int b, int c) {
//         a = 5;
//         b = 3;
//         c = 4;

        if (a < b && a < c) {
            System.out.println("minSide" + a);
        }
        if (b < a && b < c) {
            System.out.println("minSide" + b);
        }
        if (c < a && c < b) {
            System.out.println("minSide" + c);
        }
        return a;
        }

    public static boolean isEquilateralTriangle(int a, int b, int c) {


         boolean result1 = (a == b) && (b == c);
            System.out.println("треугольник равносторонний " + result1);

        boolean result2 = (a != b) && (b != c);
            System.out.println("треугольник разносторонний " + result2);
        return false;

    }
}





