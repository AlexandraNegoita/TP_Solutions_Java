package TP2.ex3;

public class Entreprise {
    private String code;
    private String valeurTotale;
    private String categorie;

    public Entreprise(String code, String valeurTotale, String categorie) {
        this.code = code;
        this.valeurTotale = valeurTotale;
        this.categorie = categorie;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getValeurTotale() {
        return valeurTotale;
    }

    public void setValeurTotale(String valeurTotale) {
        this.valeurTotale = valeurTotale;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    @Override
    public String toString() {
        return "Entreprise{" +
                "code='" + code + '\'' +
                ", valeurTotale='" + valeurTotale + '\'' +
                ", categorie='" + categorie + '\'' +
                '}';
    }
}
