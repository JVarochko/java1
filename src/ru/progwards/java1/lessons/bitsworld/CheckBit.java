package ru.progwards.java1.lessons.bitsworld;

public class CheckBit {
    public static void main(String[] args) {
  checkBit((byte)0,0);

       }
    public static int checkBit(byte value, int bitNumber){
      int val = value & 0b1111_1111;
      val = val >> bitNumber;
      return val%2;
    }

}
