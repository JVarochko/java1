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
        System.out.println(str1+AnimalKind.ANIMAL+str3+FoodKind.UNKNOWN);
        return (str1+AnimalKind.ANIMAL+str3+FoodKind.UNKNOWN);

    }
     enum FoodKind {
        UNKNOWN,
        HAY,
        CORN;
    }

  }
