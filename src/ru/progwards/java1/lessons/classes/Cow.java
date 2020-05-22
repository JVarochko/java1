package ru.progwards.java1.lessons.classes;

public class Cow extends Animal { // класс Cow, потомок класса Animal
    public static void main(String[] args) {
        System.out.println(AnimalKind.COW);
        System.out.println(FoodKind.HAY);
    }

    public Cow(double weight) {//конструктор
        super(weight);
    }

    public AnimalKind getKind() {//переопределение метода, который возвращает COW
        System.out.println(AnimalKind.COW);
        return AnimalKind.COW;
    }

    public FoodKind getFoodKind() { //переопределение метода, который возвращает HAY
        System.out.println(FoodKind.HAY);
        return FoodKind.HAY;
    }

    public double getFoodCoeff() {//возвращает коэффициент веса еды к весу тела животного 0.05
        double w = 20;
        double FoodCoeff = weight / w;
        return FoodCoeff;
    }
}
