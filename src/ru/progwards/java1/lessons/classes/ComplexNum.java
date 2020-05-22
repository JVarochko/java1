package ru.progwards.java1.lessons.classes;


public class ComplexNum {
    public static void main(String[] args) {

        ComplexNum n1 = new ComplexNum(5, 8);
        ComplexNum n2 = new ComplexNum(3, 9);

    }

    int a;
    int b;

    public ComplexNum(int a, int b) {//конструктор, который инициализирует комплексное число
    this.a = a;
    this.b = b;
    }

    //метод - приведение к строке, выдать в формате a+bi, например, при a=1 и b=56 должно быть выдано 1+56i
    public String toString() {
        //System.out.println(a+b+"i");
        String s = this.a+"+"+this.b+"i";
        return s;
    }

    //метод - сложение комплексных чисел по формуле:(a + bi) + (c + di) = (a + c) + (b + d)i
    public ComplexNum add(ComplexNum num) {
        ComplexNum n = new ComplexNum (this.a+num.a ,this.b+num.b);
        return n;
    }

        //double add =  (a + bi) + (c + di) = (a + c) + (b + d)i;

    //метод - вычитание комплексных чисел по формуле:(a + bi) - (c + di) = (a - c) + (b - d)i
    public ComplexNum sub(ComplexNum num){
        ComplexNum n = new ComplexNum (this.a-num.a ,this.b-num.b);
        return n;

    }

    //метод - умножение комплексных чисел по формуле:(a + bi) * (c + di) = (a*c - b*d) + (b*c + a*d)i
     public ComplexNum mul(ComplexNum num){
         ComplexNum n = new ComplexNum (this.a*num.a ,this.b*num.b);
         return n;
    }
    //деление комплексных чисел по формуле:(a + bi) / (c + di) = (a*c + b*d)/(c*c+d*d) + ((b*c - a*d)/(c*c+d*d))i
    public ComplexNum div(ComplexNum num){
        ComplexNum n = new ComplexNum (this.a/num.a ,this.b/num.b);
        return n;
    }

}
//}