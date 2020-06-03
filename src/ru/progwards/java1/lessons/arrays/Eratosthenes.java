
package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

import static java.util.Arrays.*;

public class Eratosthenes {
    int  sieve[];
    int N;

    public static void main(String args[]) {
        boolean sieve[];
        //private void sift();



    }


    private boolean sieve(int n) {

        for (int i = 2; i <= N; i++) {
            boolean isPrime = true;
            System.out.println(true+" true");

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
            System.out.println(false+" false");
                    break;

                }
            }
        }

        return false;

    }


    // конструктор который должен разместить массив sieve с
    // размером в N и заполнить его значениями true, после чего вызвать метод sift()
    public Eratosthenes(int N) {
        this.sieve = sieve;
        this.N = N;
        //fill(true);
        sift();

    }

    //который, собственно и реализует алгоритм Эратосфена, просеивая составные числа.
    // Подсказка - нужно реализовать 2 вложенных цикла, внешний, например по i от 2 до N-1, и внутренний,
    // например по j который будет просеивать числа, кратные переменной внешнего цикла i*j.
    private void sift() {
        for (int i = 2; i >= N-1; i++) {
            //boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                  //  isPrime = false;
                    break;

                }
            }

            }

        }
    public boolean isSimple(int n){
        return sieve(n);
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












