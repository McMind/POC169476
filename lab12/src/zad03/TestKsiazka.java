package zad03;

import java.util.ArrayList;

public class TestKsiazka {
    public static void main(String[] args) {
        ArrayList<Ksiazka> lista = new ArrayList<>();
        lista.add(new Ksiazka("aa",25.1,2000));
        lista.add(new Ksiazka("bb",23.1,1999));
        lista.add(new Ksiazka("cc",27.4,2005));
        lista.add(new Ksiazka("dd",29.9,1970));
        lista.add(new Ksiazka("dd",23.9,1995));
        System.out.println(lista);
        System.out.println();
        lista.sort(new KsiazkaComparator());
        System.out.println(lista);
    }
}
