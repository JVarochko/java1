
package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class Eratosthenes {
    int n;
    private boolean sieve[];
    int N;

    public static void main(String args[]) {
        boolean sieve[];
        boolean isSimple;
    }
    private boolean sieve() {
        for (int i = 2; i <= N; i++) {
            boolean isPrime = true;
            System.out.println(true + " true");
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    if ( i==j)
                        continue;
                    System.out.println(false + " false");
                    break;
                }
            }
        }
        return false;
    }
    public Eratosthenes(int N) {
        sieve = new boolean[N];
        // this.sieve = sieve;
        this.N = N;
        int n = this.n;
        Arrays.fill(sieve,true);
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





