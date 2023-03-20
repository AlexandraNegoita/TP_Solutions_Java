package TP1.ex3;

public class Employe {
   private String nom;
   private String prenom;
   private String departement;
   private int experience;

    public Employe(String nom, String prenom, String departement, int experience) {
        this.nom = nom;
        this.prenom = prenom;
        this.departement = departement;
        this.experience = experience;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDepartement() {
        return departement;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", departement='" + departement + '\'' +
                ", experience=" + experience +
                '}';
    }
}
