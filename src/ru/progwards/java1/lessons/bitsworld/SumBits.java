package ru.progwards.java1.lessons.bitsworld;


public class SumBits {

    public static void main(String[] args) {
        System.out.println(sumBits((byte) 00000010)); //10
        System.out.println(sumBits((byte)  0100101)); //37
        System.out.println(sumBits((byte)  00000000));

         }

    public static int sumBits(byte value) {
        int sum = 0; // начальное значение sum =0
        int val = value & 0b1111_1111; //приведение byte к int (иначе при работе с отриц.значениями результат некорректный)
        while (val!= 0) {
            if ((val & 1) != 0) sum++;//если val и 1 != 0, то к сумме прибавляем 1
            val = (byte) (val >> 1); //побитовый сдвиг вправо
        }
        return sum;
    }

}
// данный цикл берет младший бит и проверяет его: если значение !=0, значит = 1 и нужно к сумме прибавить 1
// после этого делаем побитовый сдвиг вправо и на место младшего бита для проверки значения !=0 попадает след.бит
// так при сдвиге вправо все биты при попадании на место младшего бита проверяются на !=0 и суммируются 1+1+1...






