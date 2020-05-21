package ru.progwards.java1.lessons.classes;

public class Cow extends Animal {
    public static void main(String[] args) {
        System.out.println(AnimalKind.COW);
        System.out.println(FoodKind.HAY);
    }
    public Cow(double weight) {
        super(weight);
    }

    public AnimalKind getKind() {
        System.out.println(AnimalKind.COW);
        return AnimalKind.COW;
    }

    public FoodKind getFoodKind() {
        System.out.println(FoodKind.HAY);
        return FoodKind.HAY;
    }
}
