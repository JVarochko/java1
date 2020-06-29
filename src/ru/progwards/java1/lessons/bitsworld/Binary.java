package ru.progwards.java1.lessons.bitsworld;

import java.util.concurrent.atomic.AtomicStampedReference;

public class Binary {

    byte num;
    public Binary(byte num) {
        this.num =num;
    }
    public String toString() {

        String s1 = "1";
        String s0 = "0";
        for (num = 0; num <= 7; num = (byte) (num / 2)) {
            if (num % 2 != 0) {
                System.out.print("1");
                return s1;
            } else {
                System.out.print("0");
                return s0;
            }

        }
        num = (byte) (num >> 1);
     return s1;
    }
    public static void main(String[] args) {


    }
}
