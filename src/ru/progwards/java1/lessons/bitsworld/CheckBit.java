package ru.progwards.java1.lessons.bitsworld;

public class CheckBit {
    public static void main(String[] args) {
  checkBit((byte) 1,1);
        //System.out.println(checkBit((byte)1,1));

    }

    public static int checkBit(byte value, int bitNumber){
        int val = value & 0b1111_1111;
     byte [] array = new byte [bitNumber];
        for (int i = 0; i < 8; i++) {
            return val;
        }
        val = val >> 1;
     return val;
    }

}
