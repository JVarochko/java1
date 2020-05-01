package ru.progwards.java1.lessons.basics;

class reverseDigits{
    public static int reverseDigits(int number) {
        //int reverseDigits = 123;
        //int reverseDigits1 = 1;
        //int reverseDigits2= 2;
        //int reverseDigits3 = 3;
        //System.out.println(reverseDigits3+""+reverseDigits2+""+reverseDigits1);
        //return reverseDigits;
        //int number = 123;
        if (number < 1) {
            return 0;
        }
        int temp = number % 10;
        number = (number)/10;
        System.out.println(temp);
        return reverseDigits(number);
    }
     public static void main (String[]args){
        ru.progwards.java1.lessons.basics.reverseDigits.reverseDigits(123);

        }
      }





