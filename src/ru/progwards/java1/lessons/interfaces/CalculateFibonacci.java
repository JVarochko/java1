package ru.progwards.java1.lessons.interfaces;

public class CalculateFibonacci {


    private static  CacheInfo lastFibo;
    public static  CacheInfo getlastFibo;

    public static Object fiboNumber(int n) {
        int a = 1;
        int b = 1;
        int c = 0;
        //int lastFibo = CacheInfo lastFibo;


            if (n == 1 | n == 2) {
                c = 1;
            } else {
                for (int i = 0; i <= n - 3; i++) {
                    c = a + b;
                    a = b;
                    b = c;
                }
            }
            System.out.println(c);
            return c;

//        if (n == c) {
//           return int;
//        }
//        else {
//            return c; //  c == lastFibo если с!=n то с равно lastFibo
//
//            }
        }

        public static CacheInfo getLastFibo () {

            return lastFibo;
        }
        public static void clearLastFibo () {
            //(int)lastFibo = 0;
        }

        public static class CacheInfo {  //вложенный класс

            public int n; //число, для которого рассчитываем Фибоначчи
            public int fibo; //результат расчета


        }

        public static void main (String[]args){
            fiboNumber(2);
        }


}

