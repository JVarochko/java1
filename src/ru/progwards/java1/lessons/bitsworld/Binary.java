package ru.progwards.java1.lessons.bitsworld;

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
     return toString();
    }
    public static void main(String[] args) {
    //Binary binary = new Binary((byte)0b00100001);
    Binary binary = new Binary((byte) 0b00000000);
    binary.toString();
    System.out.println(binary);


//   byte aByte = (byte)0b00100001;
//        System.out.println(aByte);
//        System.out.println(Integer.toBinaryString(aByte));
    }

}
