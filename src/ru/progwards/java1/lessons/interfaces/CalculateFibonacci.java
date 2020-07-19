package ru.progwards.java1.lessons.interfaces;

public class CalculateFibonacci {

    public static int fiboNumber(int n) {
        int a = 1;
        int b = 1;
        int c = 0;
        System.out.println(a);
        System.out.println(b);
        if (n==1|n==2) {
            c = 1;
            System.out.println(c);
        }else {
            for (int i = 0; i <= n - 3; i++) {
                c = a + b;
                a = b;
                b = c;
                System.out.println(c);
            }
        }
        return c;
    }

    public static class CacheInfo{

        public int n; //число, для которого рассчитываем Фибоначчи
        public int fibo; //результат расчета
    }

}
