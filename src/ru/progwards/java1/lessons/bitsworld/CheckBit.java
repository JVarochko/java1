package ru.progwards.java1.lessons.bitsworld;

public class CheckBit {
    public static void main(String[] args) {
checkBit((byte) 8,8);
        System.out.println(checkBit((byte)8,8));

    }

    public static int checkBit(byte value, int bitNumber){

    byte aByte = (byte)0b00100001;
        //String str = 0;
//        bitNumber = 0;
//        for (int i = 0; i < str.length(); i++) {
//            bitNumber <<= 1;
//            if (str.charAt(i) == '1') bitNumber++;
//        }
        return bitNumber;
    }

}
