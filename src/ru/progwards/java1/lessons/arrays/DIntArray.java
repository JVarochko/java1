package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class DIntArray {
    public static void main(String[] args) {
        int[] array = new int[]{8, 3, 9, 45, 12};
        DIntArray intArray = new DIntArray();
        for (int elem : array) {
            intArray.add(elem);
            System.out.println(elem);

        }
        Arrays.toString(intArray.getArray());
        
        System.out.println(intArray.getArray());

    }

    private int[] array = {};// private переменную - массив целых чисел.

    public int[] getArray() { //доступ через getArray к private int[] array.
        return array;
    }

    public DIntArray() {//конструктор по умолчанию

    }

    public void add(int num) {//добавляет элемент num в конец массива

        int[] array1 = new int[array.length + 1];
        System.arraycopy(array, 0, array1, 0, array.length);
        //System.arraycopy(array, num, array1, 0, num + 1);
        array1[array1.length - 1] = num;
        System.out.println("add"+array.length);
        array = array1;
    }

    public void atInsert(int pos, int num) {//добавляет элемент num в позицию pos массива где-то посередине
        int[] array = {8, 3, 9, 45, 12};
        int[] array1 = new int[array.length + 1];
        System.arraycopy(array, 0, array1, 0, array.length);
        System.arraycopy(array, num, array1, 0, num + 1);
        array = array1;
    }

    public void atDelete(int pos) {// удаляет элемент в позиции pos массива
        int[] array1 = new int[array.length - 1];
        System.arraycopy(array, 0, array1, 0, pos);
        System.arraycopy(array, pos + 1, array1, pos, array.length - pos - 1);
        array = array1;

    }

    public int at(int pos) {//возвращает элемент по индексу pos.
        return pos;
    }
}





