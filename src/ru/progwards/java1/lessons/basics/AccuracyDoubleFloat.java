package ru.progwards.java1.lessons.basics;

public class AccuracyDoubleFloat {
    //Формула объёма шара 4/3πR3.

    public static double volumeBallDouble(double radius) {
        double pi = 3.14;
        //double r = 6371.2;
        double b = 3;
        double c = Math.pow(radius,b);
        double v = c*pi*4.0/3.0;
        System.out.println("Объем Земли double = "+v);
        return v;
     }

    public static float volumeBallFloat(float radius) {
        float pi = 3.14f;
       //float r = 6371.2f;
        float b = 3f;
        float v1 = (radius * radius * radius) * pi * 4f / 3f;
         System.out.println("Объем Земли float = "+v1);
        return v1;
    }

    public static double calculateAccuracy(double radius) {
        //double dif;
        //dif = volumeBallDouble(6371.2)-(double)volumeBallFloat(6371.2f);
        double vd = volumeBallDouble(radius);
        double vf = (double) volumeBallFloat((float)radius);
        double dif = vd - vf;
        System.out.println( vd - vf);
        System.out.println( dif );
        System.out.println("Разница double и float в объеме Земли "+dif);
        return dif;
    }

    public static void main(String[] args) {
      ru.progwards.java1.lessons.basics.AccuracyDoubleFloat.volumeBallDouble(6371.2);
      ru.progwards.java1.lessons.basics.AccuracyDoubleFloat.volumeBallFloat(6371.2f);
      ru.progwards.java1.lessons.basics.AccuracyDoubleFloat.calculateAccuracy(6371.2f);

    }

}
