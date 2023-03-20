package TP0.ex3;

public class Main {
    public static boolean isPrime(int number) {
        if(number % 2 == 0) {
            return false;
        } else {
            for (int i = 3; i < Math.sqrt(number); i += 2) {
                if (number % i == 0){
                    return false;
                }
            }
        }
        return true;
    }


    public static void main(String[] args) {
        int noChosen = 13;
        int noEvenDivisors = 0;
        if(noChosen % 2 == 0){
            int i = 4;
            noEvenDivisors += 2;
            while(i < noChosen) {
                if (noChosen % i == 0){
                    noEvenDivisors++;
                }
                i += 2;
            }
        }
        System.out.println("J'ai choisi le numero " + noChosen + " qui a " + noEvenDivisors + " divisors paires.");

        if (isPrime(noChosen)) {
            System.out.println("\tLe numero est prime.");
        } else {
            System.out.println("\tLe numero n'est pas prime.");
        }

    }
}