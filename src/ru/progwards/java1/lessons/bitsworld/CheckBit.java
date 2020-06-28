package ru.progwards.java1.lessons.bitsworld;

public class CheckBit {
    public static void main(String[] args) {
checkBit((byte) 6,5);
        System.out.println(checkBit((byte)5,5));
    }

    public static int checkBit(byte value, int bitNumber){
       // value =0;
        byte [] array = new byte [8];
        value = (byte) (value >> 1);
        bitNumber = (bitNumber >> 1);

        return bitNumber;

    }

}
