package ru.progwards.java1.lessons.bitsworld;

public class CheckBit {
    public static void main(String[] args) {
  checkBit((byte)0b00100001,2);
        System.out.println(checkBit((byte)0b11111111,2));
        System.out.println(checkBit((byte)0b00100001,0));

       }
    public static int checkBit(byte value, int bitNumber){
      int val = value & 0b1111_1111;// приведение к int
      val = val >> bitNumber; // обитовый сдвиг вправо на bitNumber
      return val%2;// возвращаем результат остатка от деления на 2
    }

}
