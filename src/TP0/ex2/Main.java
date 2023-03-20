package TP0.ex2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Les personnes et les ages: ");
        ArrayList<String> personnes = new ArrayList<>(Arrays. asList("Maria", "Elena", "Ana", "Mihaela"));
        ArrayList<Integer> ages = new ArrayList<>(Arrays. asList(22, 12, 20, 7));
        System.out.println("Personnes: " + personnes);
        System.out.println("Ages: " + ages);
        System.out.println();

        System.out.println("La personne la plus agee: ");
        int maxAge = 0;
        int indiceMax = 0;
        for (int i = 0; i < ages.size(); i++) {
            if (maxAge < ages.get(i)) {
                maxAge = ages.get(i);
                indiceMax = i;
            }
        }
        System.out.println("\t" + personnes.get(indiceMax));
        System.out.println();

        System.out.println("La moyenne d'age: ");
        float ageMoyenne = 0;
        for(int age : ages) {
            ageMoyenne += (float) age;
        }
        ageMoyenne = ageMoyenne / 4;
        System.out.println("\t" + ageMoyenne);
        System.out.println("Les personnes qui ont l'age moins que la moyenne: ");
        for(int age : ages) {
            if(age < ageMoyenne) {
                System.out.println("\t" + personnes.get(ages.indexOf(age)) + " : " + age);
            }
        }
        System.out.println();

        System.out.println("Les personnes qui ont le nombre de lettres dans leur nom egal avec leur age: ");
        for(String nom : personnes) {
            if(nom.length() == ages.get(personnes.indexOf(nom))){
                System.out.println("\t" + nom + " : " + ages.get(personnes.indexOf(nom)));
            }
        }
    }
}