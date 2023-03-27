package TP1.ex3;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employe> employes = new ArrayList<>();
        employes.add(new Employe(args[0], args[1], args[2], Integer.parseInt(args[3])));
        employes.add(new Employe("Adem","Browning", "HR", 3));
        employes.add(new Employe("Carly","Fletcher", "IT", 2));

        System.out.println("b)");
        for(Employe e : employes){
            System.out.println(e.toString());
        }
        System.out.println();

        System.out.println("d)");
        int expMax = -1;
        Employe employeExpMax = employes.get(0);
        for(Employe e : employes){
            if(e.getExperience() > expMax){
                expMax = e.getExperience();
                employeExpMax = e;
            }
        }
        System.out.println("L'employe avec la plus grande experience: " + employeExpMax.toString());
        System.out.println();

        System.out.println("e)");
        double expProduct = 1;
        for(Employe e : employes){
            expProduct *= e.getExperience();
        }
        double geometricMean = Math.pow(expProduct, (double)1/employes.size());
        System.out.println("La moyenne geometrique de l'experience: " + geometricMean);
        System.out.println();

        System.out.println("f)");
        int prenomLength = -1;
        Employe employePrenomMax = employes.get(0);
        for(Employe e : employes){
            if(e.getPrenom().length() > prenomLength){
                prenomLength = e.getPrenom().length();
                employePrenomMax = e;
            }
        }
        System.out.println("L'employe avec le prenom le plus longue: " + employePrenomMax.toString());
        System.out.println();

        System.out.println("g)");
        System.out.println(employes);
        Collections.sort(employes, new Trier());
        System.out.println(employes);
    }
}