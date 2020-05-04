
package ru.progwards.java1.lessons.basics;


public class Astronomy {

    public static void main(String[] args) {
       // ru.progwards.java1.lessons.basics.Astronomy.sphereSquare(double );
        ru.progwards.java1.lessons.basics.Astronomy.earthSquare();
        ru.progwards.java1.lessons.basics.Astronomy.mercurySquare();
        ru.progwards.java1.lessons.basics.Astronomy.jupiterSquare();
        ru.progwards.java1.lessons.basics.Astronomy.earthVsMercury();
        ru.progwards.java1.lessons.basics.Astronomy.earthVsJupiter();

    }

    public static Double sphereSquare (double r ){
        double pi = 3.14;
        double s = 4 * pi * (r * r);
        return s;
    }
    public static Double earthSquare(){
        return sphereSquare(6371.2);

    }
    public static Double mercurySquare(){
         return sphereSquare(2439.7);
    }
    public static Double jupiterSquare(){
          return sphereSquare(71492);
    }
    public static Double earthVsMercury(){
        double dif1 = earthSquare()/mercurySquare();
        return dif1;

          }
    public static Double earthVsJupiter(){
         double dif2 = earthSquare()/jupiterSquare();
         return dif2;

    }


}

