package TP1.ex6;

import TP1.ex6.Manager;

public class Main {
    public static void main(String[] args) {

        Manager m = new Manager("Dino", "Bernard", "IT", 3, 2);
        System.out.println(m.toMap());
    }
}