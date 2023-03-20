package TP1.ex8;

public class Main {
    public static void main(String[] args) {
        Pangram phrase1 = new Pangram("The quick brown fox jumps over the lazy dog.");
        Pangram phrase2 = new Pangram("Ana are mere.");

        if(phrase1.isPangram()){
            System.out.println("Premiere phrase est pangram");
        } else{
            System.out.println("Premiere phrase n'est pas pangram");
        }
        if(phrase2.isPangram()){
            System.out.println("Deuxieme phrase est pangram");
        } else{
            System.out.println("Deuxieme phrase n'est pas pangram");
        }
    }
}