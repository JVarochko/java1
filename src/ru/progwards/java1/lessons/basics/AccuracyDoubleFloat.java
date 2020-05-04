package ru.progwards.java1.lessons.basics;

public class AccuracyDoubleFloat {
    //Формула объёма шара 4/3πR3.

    final static double earthRadius = 6371.2;


    public static void main(String[] args) {
  ru.progwards.java1.lessons.basics.AccuracyDoubleFloat.volumeBallDouble(earthRadius);
  ru.progwards.java1.lessons.basics.AccuracyDoubleFloat.volumeBallFloat((float)earthRadius);
  ru.progwards.java1.lessons.basics.AccuracyDoubleFloat.calculateAccuracy(earthRadius);

   System.out.println(volumeBallDouble(earthRadius)-volumeBallFloat((float) earthRadius));
    }

    public static double volumeBallDouble(double radius) {
        double pi = 3.14;
        double b = 3;
        double c = Math.pow(radius,b);
        double v = c*pi*4.0/3.0;
        //System.out.println("Объем Земли double = "+v);
        return v;
     }

    public static float volumeBallFloat(float radius) {
        float pi = 3.14f;
        float b = 3f;
        float v1 = (radius * radius * radius) * pi * 4f / 3f;
        // System.out.println("Объем Земли float = "+v1);
        return v1;
    }

    public static double calculateAccuracy(double radius) {

       double dif = volumeBallDouble(radius) - volumeBallFloat((float)radius);
       System.out.println( dif );
       System.out.println("Разница double и float в объеме Земли "+dif);
       return dif;
    }

  }


