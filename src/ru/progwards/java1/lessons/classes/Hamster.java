package ru.progwards.java1.lessons.classes;

public class Hamster extends Animal {
    public static void main(String[] args) {
        System.out.println(AnimalKind.HAMSTER);
        System.out.println(FoodKind.CORN);

    }
    public Hamster(double weight) {
        super(weight);
    }

    public AnimalKind getKind() {
        System.out.println(AnimalKind.HAMSTER);
        return AnimalKind.HAMSTER;
    }

    public FoodKind getFoodKind() {
        System.out.println(FoodKind.CORN);
        return FoodKind.CORN;
    }

}
