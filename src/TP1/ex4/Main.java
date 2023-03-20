package TP1.ex4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Manager m = new Manager("Dino", "Bernard", "IT", 3, 2);
        m.isProperty("nom");
        m.isProperty("fonction");
        m.isProperty("departement");
    }
}