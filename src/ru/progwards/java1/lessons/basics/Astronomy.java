package ru.progwards.java1.lessons.basics;

public class Astronomy {
    public static Double sphereSquare (double r ){
        double pi = 3.14;
        double s = 4 * pi * (r * r);
        return s;
    }
    public static Double earthSquare(double r){
       r =6371.2;
       double pi = 3.14;
       double s = 4 * pi * (r * r);
       System.out.println("Площадь поверхности Земли " +sphereSquare(6371.2));
        return sphereSquare(6371.2);

    }
    public static Double mercurySquare(double r){
        r = 2439.7;
        double pi = 3.14;
        double s = 4 * pi * (r * r);
      System.out.println("Площадь поверхности Меркурия "+sphereSquare(2439.7));
        return sphereSquare(2439.7);
    }
    public static Double jupiterSquare(double r){
        r = 71492;
        double pi = 3.14;
        double s = 4 * pi * (r * r);
        System.out.println("Площадь поверхности Юпитера "+sphereSquare(71492));
        return sphereSquare(71492);
    }
    public static Double earthVsMercury(double dfm){
        dfm = earthSquare(6371.2)/mercurySquare(2439.7);
       System.out.println( "Отношение площади Земли к площади Меркурия "+dfm);
        return dfm;
    }
    public static Double earthVsJupiter(double dfj){
        dfj = earthSquare (6371.2)/jupiterSquare (71492);
       System.out.println( "Отношение площади Земли к площади Юпитера "+dfj);
        return dfj;
    }

    public static void main(String[] args) {
        ru.progwards.java1.lessons.basics.Astronomy.earthSquare(6371.2);
        ru.progwards.java1.lessons.basics.Astronomy.mercurySquare(2439.7);
        ru.progwards.java1.lessons.basics.Astronomy.jupiterSquare(71492);
        ru.progwards.java1.lessons.basics.Astronomy.earthVsMercury(6371.2/2439.7);
        ru.progwards.java1.lessons.basics.Astronomy.earthVsJupiter(6371.2/71492);

    }
}




