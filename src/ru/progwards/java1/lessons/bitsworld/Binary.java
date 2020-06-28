package ru.progwards.java1.lessons.bitsworld;

public class Binary {
    byte num;

    public Binary(byte num) {
    }

    public String toString() {

        //byte num=0;
        String bin = String.format(Integer.toBinaryString(num));
        //String bin = String.format("%8s", Integer.toBinaryString(num)).replace(' ', ' ');
        System.out.println(bin);
        return bin;
    }

    public static void main(String[] args) {
       

    }
}
