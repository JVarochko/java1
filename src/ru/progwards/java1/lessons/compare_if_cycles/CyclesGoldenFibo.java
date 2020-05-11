package ru.progwards.java1.lessons.compare_if_cycles;

public class CyclesGoldenFibo {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        System.out.println(a/b);
        System.out.println(b/a);

        containsDigit(1,1);
        System.out.println(containsDigit(1,1));
       fiboNumber(15);
        isGoldenTriangle(8,8,5);
        System.out.println(isGoldenTriangle(5,5,3));
        //checkGolden(5,3);

    }
    public static boolean containsDigit(int number, int digit){
        int firstDigit = number / 10;
        int secondDigit = (number/10)%10;
        int thirdDigit = number%10;
        int count =0;
        if (firstDigit == secondDigit);
        count++;
        boolean result = (number==digit);
        return result;

   }

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
        public static boolean isGoldenTriangle(int a, int b, int c) {

            boolean result = ((a == b) && ((double)a / c) >= 1.61703 || ((double)a / c) <= 1.61903) | ((b == c) && ((double)b / a) >= 1.61703 || ((double)b / a) <= 1.61903) | ((a == c) && ((double)a / b)  >= 1.61703 || ((double)a / b) <= 1.61903);
            return result;
        }

        //public static boolean checkGolden(int x, int y) { // метод для вычисления отношения ребра к основанию треугольника return если соотв-ет
         // double div = ((double) x) / y);
        //   return div >= 1.61703 && div <= 1.61903;
        //}
    }




