package TP0.ex1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nom, Prenom, Age: ");
        System.out.println("\tStudent; " + "Fils; " + 20);
        System.out.println();
        System.out.println("Les donnees de 3 personnes: ");

        Scanner s = new Scanner(System.in);
        int j = 1;
        String nom, prenom;
        int age;
        ArrayList<Person> persons = new ArrayList<>();
        while(j <= 3) {
            System.out.println("Personne no. " + j + ": ");
            System.out.println("\tNom: ");
            nom = s.nextLine();
            System.out.println("\tPrenom: ");
            prenom = s.nextLine();
            System.out.println("\tAge: ");
            age = s.nextInt();
            s.nextLine();
            persons.add(new Person(nom, prenom, age));
            j++;
        }
        System.out.println("Les personnes sont: ");
        for(int i = 0; i < persons.size(); i++){
            persons.get(i).printPerson();
        }

        System.out.println();
        System.out.println("La date d'aujourd'jui et l'heure: ");
        LocalDateTime present = LocalDateTime.now();
        DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter formatHour = DateTimeFormatter.ofPattern("HH:mm");
        String presentDate = present.format(formatDate);
        String presentHour = present.format(formatHour);
        System.out.println("\tLa date d'aujourd'hui: "+presentDate);
        System.out.println("\tL'heure currente: "+presentHour);

    }
}