package ru.progwards.java1.lessons.compare_if_cycles;

public class CyclesGoldenFibo {
    public static void main(String[] args) {
        containsDigit(1,1);
        System.out.println(containsDigit(1,1));
       fiboNumber(15);
        isGoldenTriangle(5,5,3);
        System.out.println(isGoldenTriangle(5,5,3));

    }
    public static boolean containsDigit(int number, int digit){
        boolean result = (number>=digit);
        return result;

   }

    public static int fiboNumber(int n){
        int a = 1;
        int b = 1;
        int c ;
        System.out.println(a+" "+b+" ");
        for( n =3; n<=15; n++) {
            c = a + b;
            System.out.println(c + " ");
            a = b;
            b = c;

        }
        System.out.println();
        return n;
        }
    public static boolean isGoldenTriangle(int a, int b, int c){
        boolean result = ((a == b)& a/c == 1.61803 )| ((b == c)& b/a == 1.61803) | ((a == c)& a/b ==1.61803);
        return result;

    }

    }


