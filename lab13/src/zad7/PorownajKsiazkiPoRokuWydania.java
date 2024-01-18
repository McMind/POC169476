package zad7;

import java.util.Comparator;

public class PorownajKsiazkiPoRokuWydania implements Comparator<Ksiazka> {
    @Override
    public int compare(Ksiazka o1, Ksiazka o2) {
        return Integer.compare(o1.getRokWydania(), o2.getRokWydania());
    }
}
