package ru.progwards.java1.lessons.classes;

public class Animal {
    public static void main(String[] args) {
        System.out.println(AnimalKind.ANIMAL);
        System.out.println(FoodKind.UNKNOWN);
        System.out.println(String.CASE_INSENSITIVE_ORDER);

    }
    double weight;

    public Animal(double weight) {
        this.weight = weight;
    }

    public AnimalKind getKind() {
        System.out.println(AnimalKind.ANIMAL);
        return AnimalKind.ANIMAL;
    }

    public FoodKind getFoodKind() {
        System.out.println(FoodKind.UNKNOWN);
        return FoodKind.UNKNOWN;
    }

    public String toString() {

        String str1 = "I am ";

        String str3 = " , eat ";


       
        return getClass().getName() + "@" + Integer.toHexString(hashCode());

        //String str1 = "I am ";

        //String str3 = " , eat ";
        //System.out.println("I am "+AnimalKind getkind+str3+FoodKind);




//        System.out.print(str1);
//        System.out.print(AnimalKind.ANIMAL);
//        System.out.print(str3);
//        System.out.print(FoodKind.UNKNOWN);
//
//        System.out.print(str1);
//        System.out.print(AnimalKind.COW);
//        System.out.print(str3);
//        System.out.print(FoodKind.HAY);
//
//        System.out.print(str1);
//        System.out.print(AnimalKind.HAMSTER);
//        System.out.print(str3);
//        System.out.print(FoodKind.HAY);
//
//        System.out.print(str1);
//        System.out.print(AnimalKind.DUCK);
//        System.out.print(str3);
//        System.out.print(FoodKind.CORN);
//        return (str1+str3);


    }
     enum FoodKind {
        UNKNOWN,
        HAY,
        CORN;
    }

  }
