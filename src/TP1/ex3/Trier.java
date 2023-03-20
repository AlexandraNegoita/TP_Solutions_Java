package TP1.ex3;

import java.util.Comparator;

public class Trier implements Comparator<Employe> {
    @Override
    public int compare(Employe o1, Employe o2) {
        return o1.getNom().compareTo(o2.getNom());
    }
}
