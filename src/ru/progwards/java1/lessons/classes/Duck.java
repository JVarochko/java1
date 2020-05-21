package ru.progwards.java1.lessons.classes;

public class Duck extends Animal {
    public static void main(String[] args) {
        System.out.println(AnimalKind.DUCK);
        System.out.println(FoodKind.CORN);

    }
    public Duck(double weight) {
        super(weight);
    }
    public AnimalKind getKind() {
        System.out.println(AnimalKind.DUCK);
        return AnimalKind.DUCK;
    }

    public FoodKind getFoodKind() {
        System.out.println(FoodKind.CORN);
        return FoodKind.CORN;
    }


    }

