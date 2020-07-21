package ru.progwards.java1.lessons.interfaces;


import static ru.progwards.java1.lessons.interfaces.FoodKind.*;
import static ru.progwards.java1.lessons.interfaces.FoodKind.UNKNOWN;

public class Animal implements FoodCompare {
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
        return FoodKind.UNKNOWN;
    }
    public String toString() {//метод, который возвращает информацию о животном в формате: I am <AnimalKind>, eat <FoodKind>
        String str1 = "I am ";
        String str3 = ", eat ";

        System.out.println(str1 + getKind() + str3 + getFoodKind());
        return (str1 + getKind() + str3 + getFoodKind());

    }


    public double getWeight() {//метод, который возвращает вес животного

        return weight;
    }

    public double getFoodCoeff() {//возвращает коэффициент веса еды к весу тела животного 0.02
//        double w = 50;
//        double FoodCoeff = weight / w;
        return 0.02;

    }

    //метод который рассчитывает необходимый вес еды, по формуле - вес-еды = вес-животного * коэффициент веса тела.
    public double calculateFoodWeight() {
//        double FoodWeight = (weight * FoodCoeff) / w;
//        return FoodWeight;
        return weight * getFoodCoeff();
    }

    //метод, который возвращает информацию о животном в формате: I am <AnimalKind>, eat <FoodKind> <CalculateFoodWeight>
    public String toStringFull() {
        String str1 = "I am ";
        String str3 = ", eat ";
        System.out.println(str1 + getKind() + str3 + getFoodKind() + "" + calculateFoodWeight());
        return (str1 + getKind() + str3 + getFoodKind() + "" + calculateFoodWeight());
    }

    //______________________________________________________________________________________________
    public boolean equals(Object anObject) {
        //возвращает true, если объекты равны и false если не равны по параметру - вес животного.
        if (this == anObject) return true;
        if (anObject == null || getClass() != anObject.getClass()) return false;
        Animal that = (Animal) anObject;
        return Double.compare(that.getWeight(), this.getWeight()) == 0;
    }
    //  метод, который возвращает информацию о цене 1 кг еды.
    // метод реализовать в виде switch по FoodKind со следующими значениями
    // HAY : 20  // CORN: 50 // UNKNOWN: 0
    //double getFood1kgPrice=FoodKind.toString();
    public double getFood1kgPrice() {

        switch (getFoodKind()) {
            case HAY: return 20D;
            case CORN:return 50D;
            case UNKNOWN:return 0;
        }

         return 0D;
    }

    public double getFoodPrice() {
        // который возвращает информацию о цене еды для данного животного по формуле
        //calculateFoodWeight() * getFood1kgPrice()
        double getFoodPrice = calculateFoodWeight() * getFood1kgPrice();
        return getFoodPrice;

    }
    @Override
      public int compareFoodPrice(Animal animal) {

        if (Double.compare(getFoodPrice(), getFoodPrice()) < 0) {
            return -1;
        }
        if (Double.compare(getFoodPrice(), getFoodPrice()) > 0) {
            return 1;
        }
            return 0;

}

    public static void main (String[]args){
            System.out.println(AnimalKind.ANIMAL);
            System.out.println(UNKNOWN);


            //System.out.println(getFood1kgPrice(double));

            //CompareFoodPrice  compareFoodPrice = CompareFoodPrice(result);
            //System.out.println(compareFoodPrice(HAY, CORN));

            //public String toString
            // метод, который возвращает информацию о животном в формате:
            // return (str1 + AnimalKind.class.getSuperclass() + str3 + FoodKind.class.getSuperclass() + calculateFoodWeight());
            System.out.println(String.CASE_INSENSITIVE_ORDER);

            //public double getWeight();return weight;

            
            //public double getFoodCoeff();return FoodCoeff;

            //calculateFoodWeight() return FoodWeight;
            

            //public boolean equals(Object anObject)
            //return Double.compare(that.getWeight(), this.getWeight()) == 0;

            //public double getFood1kgPrice() {
            //return getFoodPrice;


            //public double getFoodPrice()
            // который возвращает информацию о цене еды для данного животного по формуле

           // public int compareFoodPrice(Animal animal)

           // return result;


        }


}


