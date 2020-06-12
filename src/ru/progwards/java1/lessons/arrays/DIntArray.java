package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class DIntArray {
    public static void main(String[] args) {
        int[] array = new int[]{8, 3, 9, 45, 12};
        DIntArray intArray = new DIntArray();
        for (int elem : array) {
            intArray.add(elem);

        }
        System.out.println(Arrays.toString(intArray.getArray()));
        intArray.atInsert(3,2);
        System.out.println(Arrays.toString(intArray.getArray()));
        intArray.atDelete(3);
        System.out.println(Arrays.toString(intArray.getArray()));
        intArray.at(3);

    }

    private int[] array = {};// private переменную - массив целых чисел.
    public int[] getArray() { //доступ через getArray к private int[] array.
        return array;
    }
    public DIntArray() {//конструктор по умолчанию
    }
    public void add(int num) {//добавляет элемент num в конец массива
        int[] array1 = new int[array.length + 1];
        int index =array.length;
        System.arraycopy(array, 0, array1, 0, index);
        array1[array1.length - 1] = num;
        array = array1;
    }
    public void atInsert(int pos, int num) {//добавляет элемент num в позицию pos массива где-то посередине
        int[] array1 = new int[array.length + 1];
        System.arraycopy(array, 0, array1, 0, pos);
        System.arraycopy(array,pos, array1, pos+1, array.length-pos);
        array1[pos] = num;
        array = array1;
    }
    public void atDelete(int pos) {// удаляет элемент в позиции pos массива
        //int index = array.length;
        int[] array1 = new int[array.length - 1];
        System.arraycopy(array, 0, array1, 0, pos );
        System.arraycopy(array, pos+1, array1, pos, array.length -pos-1);
        array = array1;
    }
    public int at(int pos) {//возвращает элемент по индексу pos.
        for (int i = 0; i < array.length; i++){
            System.out.println("pos"+i+"="+array[i]);
        }


//        add(pos);
//        System.out.println(pos);
//        atInsert(pos,2);
//        System.out.println(pos);
//        atDelete(pos);
//        System.out.println(pos);

        return pos;
    } //возвращает элемент по индексу pos.
}





