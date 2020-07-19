package ru.progwards.java1.lessons.interfaces;

public class Duck extends Animal { //класс Duck, потомок класса Animal
        public static void main(String[] args) {
            System.out.println(AnimalKind.DUCK);
            System.out.println(FoodKind.CORN);


        }
        public Duck(double weight) {//конструктор
            super(weight);
        }
        public AnimalKind getKind() { //переопределение метода, который возвращает DUCK
            System.out.println(AnimalKind.DUCK);
            return AnimalKind.DUCK;
        }

        public FoodKind getFoodKind() {//переопределение метода, который возвращает CORN
            System.out.println(FoodKind.CORN);
            return FoodKind.CORN;
        }
        public double getFoodCoeff() {//возвращает коэффициент веса еды к весу тела животного 0.04
            double w = 25;
            double FoodCoeff = weight / w;
            return FoodCoeff;
        }
    }


