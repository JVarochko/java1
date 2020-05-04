
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
        //r =6371.2;
        //double pi = 3.14;
        //double s = 4 * pi * (r * r);
       // System.out.println("Площадь поверхности Земли " +sphereSquare(6371.2));
        return sphereSquare(6371.2);

    }
    public static Double mercurySquare(){
        //r = 2439.7;
        //double pi = 3.14;
        //double s = 4 * pi * (r * r);
        //System.out.println("Площадь поверхности Меркурия "+sphereSquare(2439.7));
        return sphereSquare(2439.7);
    }
    public static Double jupiterSquare(){
       // r = 71492;
        //double pi = 3.14;
        //double s = 4 * pi * (r * r);
        //System.out.println("Площадь поверхности Юпитера "+sphereSquare(71492));
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

