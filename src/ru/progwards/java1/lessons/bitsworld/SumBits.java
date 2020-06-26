package ru.progwards.java1.lessons.bitsworld;


public class SumBits {

    public static void main(String[] args) {
        System.out.println(1101);
        System.out.println((byte) 1101);
        System.out.println(sumBits((byte) 1101));
        System.out.println(Integer.toBinaryString(13));
        System.out.println(Integer.toBinaryString(0b1101));
        System.out.println(Integer.toBinaryString(1101));
    }

    public static int sumBits(byte value) {
        int sum = 0;
        int val = value & 0b1111_1111;
        while (val!= 0) {
            if ((val & 1) != 0) sum++;
            val >>= 1;
            val = (byte) (val >> 1);

        }
        return sum;
    }

}









