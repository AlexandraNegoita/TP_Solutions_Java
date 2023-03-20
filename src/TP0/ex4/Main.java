package TP0.ex4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void SumAndAvg(String filename){
        try {
            File f = new File(filename);
            Scanner s = new Scanner(f);
            int sum = 0;
            int avg = 0;
            int l = 0;
            while (s.hasNextLine()) {
                sum += s.nextInt();
                l++;
                s.nextLine();
            }
            s.close();
            avg = sum / l;
            System.out.println("La somme: " + sum);
            System.out.println("La moyenne: " + avg);
        } catch (FileNotFoundException e) {
            System.out.println("Le fichier n'a ete pas trouve.");
            e.printStackTrace();
        }
    }

    public static void multiplicationTable(int number){
        for(int i = 0; i <= 10; i++){
            System.out.println(i + " x "+ number +" = " + 5 * i);
        }
    }

    public static boolean noPerfect(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0){
                sum += i;
            }
        }
        if(sum == number) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isStrong(int number) {
        int sum = 0;
        int f = 1;
        int numberCpy = number;
        while(number != 0){
            int digit = number % 10;
            for(int i = 1; i <= digit; i++){
                f *= i;
            }
            sum += f;
            number /= 10;
            f = 1;
        }
        if(sum == numberCpy) {
            return true;
        } else {
            return false;
        }
    }

    public static void starPyramid(int n){
        for(int i = 0; i < n; i++) {
            for(int j = n - i; j > 1; j--){
                System.out.print(" ");
            }
            for(int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void numberPyramid(int n){
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for(int k = 1; k < n - i; k++) {
                System.out.print(k);
            }
            for(int k = n - i; k >= 1; k--) {
                System.out.print(k);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("La somme et la moyenne de 10 numeros: ");
        int noMultiplication = 5;
        System.out.println("La table de multiplication pour " + noMultiplication + ": ");
        multiplicationTable(noMultiplication);

        int nPerfect = 496;
        if(noPerfect(nPerfect) == true){
            System.out.println(nPerfect + " est parfait.");
        } else {
            System.out.println(nPerfect + " n'est pas parfait.");
        }

        int noStrong = 145;
        if(isStrong(noStrong) == true){
            System.out.println(noStrong + " est Strong.");
        } else {
            System.out.println(noStrong + " n'est pas Strong.");
        }

        System.out.println("Pyramide d'etoiles: ");
        starPyramid(4);

        System.out.println("Pyramide de numeros: ");
        numberPyramid(7);

    }
}