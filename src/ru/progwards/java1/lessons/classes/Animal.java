package ru.progwards.java1.lessons.classes;

public class Animal {
    public static void main(String[] args) {
        System.out.println(AnimalKind.ANIMAL);
        System.out.println(FoodKind.UNKNOWN);
        System.out.println(String.CASE_INSENSITIVE_ORDER);

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
        System.out.println(FoodKind.UNKNOWN);
        return FoodKind.UNKNOWN;
    }

    public String toString() {//метод, который возвращает информацию о животном в формате: I am <AnimalKind>, eat <FoodKind>
        String str1 = "I am ";
        String str3 = ", eat ";

        System.out.println(str1+AnimalKind.class.getSuperclass()+str3+FoodKind.class.getSuperclass());
        return (str1+AnimalKind.class.getSuperclass()+str3+FoodKind.class.getSuperclass());

    }

    public double getWeight(){//метод, который возвращает вес животного
        return weight;
    }

    public double getFoodCoeff(){//возвращает коэффициент веса еды к весу тела животного 0.02
        double w = 50;
        double FoodCoeff = weight/w;
        return FoodCoeff;

    }
    //метод который рассчитывает необходимый вес еды, по формуле - вес-еды = вес-животного * коэффициент веса тела.
    public double calculateFoodWeight(){
        double FoodWeight = (weight * FoodCoeff)/w;
        return FoodWeight;
    }
    //метод, который возвращает информацию о животном в формате: I am <AnimalKind>, eat <FoodKind> <CalculateFoodWeight>
    public String toStringFull() {
        String str1 = "I am ";
        String str3 = ", eat ";
        System.out.println(str1+AnimalKind.class.getSuperclass()+str3+FoodKind.class.getSuperclass()+calculateFoodWeight());
        return (str1+AnimalKind.class.getSuperclass()+str3+FoodKind.class.getSuperclass()+calculateFoodWeight());

    }
     enum FoodKind {
        UNKNOWN,
        HAY,
        CORN;
    }

  }
