package zad03;

import java.util.Comparator;

public class KsiazkaComparator implements Comparator<Ksiazka> {
    @Override
    public int compare(Ksiazka o1, Ksiazka o2) {
        return Integer.compare(o1.rokWydania,o2.rokWydania);
    }
}
