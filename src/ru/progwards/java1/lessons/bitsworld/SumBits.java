package ru.progwards.java1.lessons.bitsworld;

public class SumBits {

    public static void main(String[] args) {
       sumBits((byte) 01001010);

    }

//    public static int sumBits(byte value){
//        int sum = 0;
//        while (value > 0) sum+=value>>=1&1;
//        System.out.println(sum);
//        return sum;
//    }

//    public static int sumBits(byte value){
//        int sum = 0;
//        while (value>0){
//            if (value%2 !=0) {
//            } else {
//                sum++;
//            }
//            value = (byte) (value >> 1);
//
//        }
//        System.out.println(sum);
//        return sum;
//    }

//    public static int sumBits(byte value){
//        //int sum = value & 1;
//        int sum = 0;
//        while (value > 0) {
//            sum += ((value >>= 1) & 1);
//        }
//        System.out.println(sum);
//        return sum;
//    }
    public static int sumBits(byte value){
        int sum = 0;
        while (value != 0) {
            sum+=1; value >>=1&1;
        }
        System.out.println(sum);
        return sum;
    }

    }








