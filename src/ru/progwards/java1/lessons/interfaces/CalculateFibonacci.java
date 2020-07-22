package ru.progwards.java1.lessons.interfaces;

public class CalculateFibonacci {

    private static CacheInfo lastFibo;
    //public static  CacheInfo getlastFibo;

    public static int fiboNumber(int n) {
        //if (n==lastFibo.n){
           // return n;
        int a = 1;
        int b = 1;
        int c = 0;

        if (n == 1 | n == 2) {
            c = 1;
        } else {
            for (int i = 0; i <= n - 3; i++) {
                c = a + b;
                a = b;
                b = c;
            }
        }
        //lastFibo = new CacheInfo(n,c);
        lastFibo = new CacheInfo(n,c);

        return c;


    }

    public static class CacheInfo {  //вложенный класс

        public int n; //число, для которого рассчитываем Фибоначчи
        public int fibo; //результат расчета

        public CacheInfo(int n, int fibo) {
            this.n = n;
            this.fibo = fibo;
        }

        public static CacheInfo getLastFibo() {

            return lastFibo;
        }

        public static void clearLastFibo() {
            lastFibo = null;
        }
    }

    public static void main(String[] args) {
        fiboNumber(2);
    }

}

