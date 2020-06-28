package ru.progwards.java1.lessons.bitsworld;

import java.math.BigInteger;

public class Binary {
    byte num;

    public Binary(byte num) {
    }

    public String toString() {

        //byte num=0;
        //String bin = String.format(Integer.toBinaryString(num));
        //String bin = String.format("%8s", Integer.toBinaryString(num)).replace(' ', ' ');
//        String bin = String.format("%8s", Integer.toBinaryString(num));
//        System.out.println(bin);
//        return bin;
        String s = ""+num;
        BigInteger bi = new BigInteger(s);
        String bin = bi.toString(2);
        return bin;
    }

    public static void main(String[] args) {


    }
}
