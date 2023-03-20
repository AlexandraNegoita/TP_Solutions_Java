package TP1.ex6;

import TP1.ex3.Employe;

import java.util.HashMap;

public class Manager extends Employe {
    public int noSubordonnees;
    public Manager(String nom, String prenom, String departement, int experience, int noSub) {
        super(nom, prenom, departement, experience);
        this.noSubordonnees = noSub;
    }

    public void isProperty(String input){
        switch (input){
            case "nom":
            case "prenom":
            case "departement":
            case "experience":
                System.out.println("Le texte " + input + " est une propriete de la classe Manager");
                break;
            default:
                System.out.println("Le texte " + input + " n'est pas une propriete de la classe Manager");
                break;

        }
    }
    public HashMap<String, Object> toMap(){
        HashMap<String, Object> hm = new HashMap<>();
        hm.put("nom", this.getNom());
        hm.put("prenom", this.getPrenom());
        hm.put("departement", this.getDepartement());
        hm.put("experience", this.getExperience());
        hm.put("noSubordonnes", this.noSubordonnees);
        return hm;
    }

}
