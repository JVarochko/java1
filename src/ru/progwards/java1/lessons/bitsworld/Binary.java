package ru.progwards.java1.lessons.bitsworld;

public class Binary {
    byte num;
    public Binary(byte num) { //конструктор
        this.num = num;
            }
    public String toString() {
        String s = "";  // всегда задавать значение String c параметром ""(кавычки без пробела внутри), иначе будет давать в начале строки значение null-ошибка
        int val = num & 0b1111_1111; //приведение byte к int (иначе при работе с отриц.значениями результат некорректный)
        for (int i = 0; i < 8; i++) {//создаем цикл for -> выбор fori -> среда создает стандартный цикл

            if (val % 2 != 0) {//если остаток от деления на 2 не равен 0, то возвращаем 1
                s="1"+s;//добавляем 1 перед s (чтобы формирование строки было справа-налево (с младшего бита(последний) к старшему(первый)
                        //таким образом последний старший бит будет в строке первым
            } else {    //иначе возвращаем 0
                s="0"+s;//добавляем 0 перед s (чтобы формирование строки было справа-налево (с младшего бита(последний) к старшему(первый)
            }           //если s+"0" - то строка формируется слева-направо
            val = val >> 1; // побитовый сдвиг вправо на 1
        }
        return s;
    }

    public static void main(String[] args) {
        Binary binary = new Binary((byte) 0b00100001);
        binary.toString();
        System.out.println(binary);
        System.out.println(Integer.toBinaryString(33));
    }

}




//        byte aByte = (byte)0b00100001;
//        System.out.println(aByte);
//        System.out.println(Integer.toBinaryString(aByte));