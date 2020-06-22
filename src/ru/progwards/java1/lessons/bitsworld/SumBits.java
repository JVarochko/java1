package ru.progwards.java1.lessons.bitsworld;

public class SumBits {

    public static void main(String[] args) {
       sumBits((byte) 0100101);
//       sumBits((byte) 100001);
//       sumBits((byte) 10101010);
//       sumBits((byte) 10101010);
    }
    public static int sumBits(byte value){
        int sum = 0;
        while (value != 0) {
            if ((value & 1) != 0) sum++;
            value >>= 1;
        }
        System.out.println(sum);
        return sum;
    }

  }






