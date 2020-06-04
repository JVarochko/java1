
package ru.progwards.java1.lessons.arrays;

public class Eratosthenes {
    int n;
    int sieve[];
    int N;

    public static void main(String args[]) {
        boolean sieve[];

     }

    private boolean sieve() {

        for (int i = 2; i <= N; i++) {
            boolean isPrime = true;
            System.out.println(true + " true");

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    System.out.println(false + " false");
                    break;

                }
            }
        }
        return false;
    }

    public Eratosthenes(int N) {
        this.sieve = sieve;
        this.N = N;
        //Arrays.fill [N] {true};
        sift();
    }

    private void sift() {
        for (int i = 2; i >= N - 1; i++) {
            //boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    //  isPrime = false;
                    break;
                }
            }
        }
    }

    public boolean isSimple(int n) {
        return sieve();
    }
}





