package ru.progwards.java1.lessons.basics;

public class AccuracyDoubleFloat {
    //Формула объёма шара 4/3πR3.

    public static double volumeBallDouble(double radius) {
        double pi = 3.14;
        double r = 6371.2;
        double b = 3;
        double c = Math.pow(r,b);
        double v = 4/(3*pi)*c;
       //System.out.println("Объем Земли double = "+v);
        return v;
     }

    public static float volumeBallFloat(float radius) {
        float pi = 3.14f;
        float r = 6371.2f;
        float b = 3f;
        float v = 4 / (3 * pi)*( r * r * r );
        //System.out.println("Объем Земли float = "+v);
        return v;
    }

    public static double calculateAccuracy(double radius) {
    double dif = volumeBallDouble(6371.2)-(double)volumeBallFloat(6371.2f);
        //System.out.println("Разница double и float в объеме Земли "+dif);
    return dif;

    }

    public static void main(String[] args) {
      ru.progwards.java1.lessons.basics.AccuracyDoubleFloat.volumeBallDouble(6371.2);
      ru.progwards.java1.lessons.basics.AccuracyDoubleFloat.volumeBallFloat(6371.2f);
      ru.progwards.java1.lessons.basics.AccuracyDoubleFloat.calculateAccuracy(6371.2);

    }

}
