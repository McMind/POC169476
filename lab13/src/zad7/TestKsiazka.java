package zad7;

import java.util.ArrayList;
import java.util.Collections;

public class TestKsiazka {
    public static void main(String[] args) {
        ArrayList<Ksiazka> ksiazki = new ArrayList<>();
        ksiazki.add(new Ksiazka("aaa", 25.5, 2001));
        ksiazki.add(new Ksiazka("aaa", 25.5, 2006));
        ksiazki.add(new Ksiazka("aaa", 25.5, 1992));
        ksiazki.add(new Ksiazka("aaa", 25.5, 1997));
        ksiazki.add(new Ksiazka("aaa", 25.5, 2000));
        System.out.println(ksiazki + "\n");
        ksiazki.sort(new PorownajKsiazkiPoRokuWydania());
        System.out.println(ksiazki);
    }
}
