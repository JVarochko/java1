package ru.progwards.java1.lessons.basics;

public class ReverseDigits {


    public static void main(String[] args) {
        int num = 123;
        int a = num % 10;
        int b = (num % 100) / 10;
        int c = (num - num % 10) / 100;
        String str = "";
        System.out.println(a+""+b+""+c);
    }
}




       // int num = 123;
        //String str = "";
       // for (int i = 1; i<3; i++) {
          //  System.out.println(num % 10);
            //num /= 10;
            //System.out.println(num % 121);
            //num/= 10;
       // }
   // }
//}

    //public static int reverseDigits(int number) {

        //int num = 123;
       // String str = "";
       // for (int i = 0; i < 3; i++) {
        //    System.out.println(num % 10);
        //    num /= 10;
       // }


       // public static void main (String[] args){
        //    ru.progwards.java1.lessons.basics.reverseDigits.reverseDigits(123);
        //    System.out.println(reverseDigits(123));






