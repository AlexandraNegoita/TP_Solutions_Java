package TP1.ex2;

public class Main {
    public static double pow(int base, int power) {
        double res = Math.pow(base, power);
        System.out.println("La fonction affiche: " + res);
        return res;
    }
    public static void main(String[] args) {
        System.out.println("La fonction retourne: " + pow(2,3));
    }
}