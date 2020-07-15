package ru.progwards.java1.lessons.interfaces;

import static ru.progwards.java1.lessons.interfaces.FoodKind.*;

public class Animal {

    public static void main(String[] args) {
        System.out.println(AnimalKind.ANIMAL);
        System.out.println(UNKNOWN);
       // System.out.println(Stri);

    }
    double weight;
    double FoodCoeff;
    double w;

    public Animal(double weight) { //конструктор, который сохраняет вес животного

        this.weight = weight;
    }


    public AnimalKind getKind() {// метод, который возвращает вид животного ANIMAL
        System.out.println(AnimalKind.ANIMAL);
        return AnimalKind.ANIMAL;
    }

    public FoodKind getFoodKind() { // метод, который возвращает вид еды UNKNOWN
        System.out.println(UNKNOWN);
        return UNKNOWN;
    }

    public String toString() {//метод, который возвращает информацию о животном в формате: I am <AnimalKind>, eat <FoodKind>
        String str1 = "I am ";
        String str3 = ", eat ";

        System.out.println(str1 + AnimalKind.class.getSuperclass() + str3 + FoodKind.class.getSuperclass());
        return (str1 + AnimalKind.class.getSuperclass() + str3 + FoodKind.class.getSuperclass());

    }

    public double getWeight() {//метод, который возвращает вес животного
        return weight;
    }

    public double getFoodCoeff() {//возвращает коэффициент веса еды к весу тела животного 0.02
        double w = 50;
        double FoodCoeff = weight / w;
        return FoodCoeff;

    }

    //метод который рассчитывает необходимый вес еды, по формуле - вес-еды = вес-животного * коэффициент веса тела.
    public double calculateFoodWeight() {
        double FoodWeight = (weight * FoodCoeff) / w;
        return FoodWeight;
    }

    //метод, который возвращает информацию о животном в формате: I am <AnimalKind>, eat <FoodKind> <CalculateFoodWeight>
    public String toStringFull() {
        String str1 = "I am ";
        String str3 = ", eat ";
        System.out.println(str1 + AnimalKind.class.getSuperclass() + str3 + FoodKind.class.getSuperclass() + calculateFoodWeight());
        return (str1 + AnimalKind.class.getSuperclass() + str3 + FoodKind.class.getSuperclass() + calculateFoodWeight());
    }
    //______________________________________________________________________________________________
   // public boolean equals(Object anObject){




        public double getFood1kgPrice() {
            //  метод, который возвращает информацию о цене 1 кг еды.
            // метод реализовать в виде switch по FoodKind со следующими значениями
            // HAY : 20  // CORN: 50 // UNKNOWN: 0
        //double getFood1kgPrice=FoodKind.toString();
                switch (FoodKind) {
                case HAY:
                    System.out.println("20");
                    return 20;
                case CORN:
                    System.out.println("50");
                    return 50;
                case UNKNOWN:
                System.out.println("0");
                return 0;
            }
        return getFood1kgPrice();
        }
        public double getFoodPrice () {
         // который возвращает информацию о цене еды для данного животного по формуле
        //calculateFoodWeight() * getFood1kgPrice()
        double getFoodPrice = calculateFoodWeight()*getFood1kgPrice();
        return getFoodPrice;

        }

    public int compareFoodPrice(Animal animal){
        //который возвращает результаты сравнения цены еды для данного животного
        // с ценой еды для другого животного, используя Double.compare;
            Integer HAY = 20;
            Integer CORN = 50;
            Integer UNKNOWN = 0;
            System.out.println(HAY.compareTo(CORN));
            System.out.println(HAY.compareTo(UNKNOWN));
            System.out.println(CORN.compareTo(UNKNOWN));
            return FoodKind.compareTo(FoodKind);
            }


}


