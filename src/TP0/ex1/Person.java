package TP0.ex1;

public class Person {
    public String nom;
    public String prenom;
    public int age;

    Person(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    void printPerson() {
        System.out.println("Nom: "+this.nom);
        System.out.println("Prenom: "+this.prenom);
        System.out.println("Age: "+this.age);
    }
}
