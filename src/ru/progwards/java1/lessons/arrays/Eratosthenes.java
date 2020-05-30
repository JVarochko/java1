
package ru.progwards.java1.lessons.arrays;

public class Eratosthenes {
    int  sieve[];
    int N;

    public static void main(String args[]) {
    }

    // конструктор который должен разместить массив sieve с
    // размером в N и заполнить его значениями true, после чего вызвать метод sift()
    public Eratosthenes(int N) {
        this.sieve = sieve;
        this.N = N;
    }

    //который, собственно и реализует алгоритм Эратосфена, просеивая составные числа.
    // Подсказка - нужно реализовать 2 вложенных цикла, внешний, например по i от 2 до N-1, и внутренний,
    // например по j который будет просеивать числа, кратные переменной внешнего цикла i*j.
    private void sift() {
        for (int i = 2; i <= N; i++) {
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;

                }
            }
            if (isPrime) {
                System.out.println(i);
            }

        }
            // является ли число n простым, нужно взять значение по индексу
            // в массиве. sieve[n]. Значение true, означает простое число, false - составное.
            //private boolean[] sieve{


                      //  }

         }
            //который возвращает sieve[n], что бы можно было узнать,
            // простое число n или составное.

          //  public boolean isSimple (int n){

                   // System.out.println(i);
                }











