package ru.progwards.java1.lessons.bitsworld;

public class SumBits {

    public static void main(String[] args) {
       sumBits((byte) 0100101);

    }

    public static int sumBits(byte value){
        int sum = 0;
        while (value > 0) sum+=value>>=1&1;
            //if(value%2){
                //sum++;
        System.out.println(sum);
        return sum;
    }

     }





