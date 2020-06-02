package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class ArraySort {

    public static void main(String[] args) {
    sort(new int [] {21,-25,38,5,7,0,-15,-3});
        //System.out.println (new int[]{3,12,-5});
    }

    public static void sort(int[] a) {
        // a = new int[]{ 35, -21, -5, 6, 1, -18, 23, -3, 8, 15, -56};
          a = new int[]{};
        for (int num : a) {
            System.out.print(num + " ");
        }
        int count;
        do {
            count = 0;
            for (int i = 0; i < a.length - 1; i++) {
                int j = (i + 1);
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                    count++;
                }
            }
        } while (count > 0);
        System.out.println();
        for (int num : a) {
            System.out.print(num + " ");


        }

    }
}




