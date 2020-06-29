package ru.progwards.java1.lessons.bitsworld;

import java.util.concurrent.atomic.AtomicStampedReference;

public class Binary {
    private byte i;
    byte num = i;
    public Binary(byte num) {
    }
    public String toString() {

        String s1 = "1";
        String s0 = "0";
        for (i = 0; i <= 8; i = (byte) (i / 2)) {
            if (i % 2 != 0) {
                System.out.print("1");
                return s1;
            } else {
                System.out.print("0");
                return s0;
            }
        }
     return s0;
    }
    public static void main(String[] args) {

    }
}
