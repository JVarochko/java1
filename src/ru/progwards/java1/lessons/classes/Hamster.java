package ru.progwards.java1.lessons.classes;

public class Hamster extends Animal { //класс Hamster, потомок класса Animal
    public static void main(String[] args) {
        System.out.println(AnimalKind.HAMSTER);
        System.out.println(FoodKind.CORN);

    }
    public Hamster(double weight) {// конструктор
        super(weight);
    }

    public AnimalKind getKind() {//переопределение метода, который возвращает HAMSTER
        System.out.println(AnimalKind.HAMSTER);
        return AnimalKind.HAMSTER;
    }

    public FoodKind getFoodKind() {//переопределение метода, который возвращает CORN
        System.out.println(FoodKind.CORN);
        return FoodKind.CORN;
    }
    public double getFoodCoeff() {//возвращает коэффициент веса еды к весу тела животного 0.03
        double FoodCoeff = weight / 33.3;
        return FoodCoeff;
    }

}
