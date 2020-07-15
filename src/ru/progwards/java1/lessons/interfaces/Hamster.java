package ru.progwards.java1.lessons.interfaces;


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
            double w = 33.3333333333333;
            double FoodCoeff = weight / w;
            System.out.println(FoodCoeff);
            return FoodCoeff;

        }

    }




