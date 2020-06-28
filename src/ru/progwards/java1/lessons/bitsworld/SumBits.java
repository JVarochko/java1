package ru.progwards.java1.lessons.bitsworld;


public class SumBits {

    public static void main(String[] args) {
        System.out.println(sumBits((byte) 00000010)); //10
        System.out.println(sumBits((byte)  0100101)); //37
        System.out.println(sumBits((byte)  00000000));

         }

    public static int sumBits(byte value) {
        int sum = 0;
        int val = value & 0b1111_1111;
        while (val!= 0) {
            if ((val & 1) != 0) sum++;
            val = (byte) (val >> 1);
        }
        return sum;
    }

}









