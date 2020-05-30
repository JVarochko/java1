package ru.progwards.java1.lessons.arrays;
import java.util.Arrays;
public class ArraySort {

    public static void main(String[] args) {
   sort();
    }
    public static void sort(){
          int[] a = {7, 4, 12, 6, 1, 18, 23, 3, 8, 15};
        int size = a.length;

        for (int i = 0; i < size; i++) {
            int tmp = a[i];

            for (int j = (i + 1); j < size; j++) {

                if (a[i] < a[j]) {
                 a[i]=tmp;
                    System.out.println(a[i]);
                }

                if (a[i] > a[j])
                    a[i]=a[j];
                    a[j]=tmp;
                    System.out.println(a[j]);
            }
        }

    }
}


