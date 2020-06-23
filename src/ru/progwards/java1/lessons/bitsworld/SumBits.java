package ru.progwards.java1.lessons.bitsworld;


public class SumBits {

    public static void main(String[] args) {
        System.out.println(0b0100101);
        System.out.println((byte) 0b0100101);
        System.out.println(sumBits((byte) 0b0100101));
    }

    public static int sumBits(byte value) {
        int sum = 0;
        while (value != 0) {
            if ((value & 1) != 0) sum++;
            value >>= 1;
        }
        return sum;
    }

}









