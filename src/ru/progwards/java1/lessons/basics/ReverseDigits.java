package ru.progwards.java1.lessons.basics;

public class ReverseDigits {

    public static int reverseDigits(int number){
        int num = 828;
        Integer a = num % 10;
        //System.out.println(a);
        Integer b = (num % 100) / 10;
        //System.out.println(b);
        Integer c = (num - num % 10) / 100;
        //System.out.println(c);
        String s;
        s = a.toString()+b.toString()+c.toString();
        Integer d = Integer.parseInt(s);
        System.out.println(s);
        return d;
         }
    public static void main(String[] args) {
        ru.progwards.java1.lessons.basics.ReverseDigits.reverseDigits( 123);

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






