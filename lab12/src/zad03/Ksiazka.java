package zad03;

public class Ksiazka {
    String tytul;
    double cena;
    int rokWydania;

    public Ksiazka(String tytul, double cena, int rokWydania) {
        this.tytul = tytul;
        this.cena = cena;
        this.rokWydania = rokWydania;
    }

    @Override
    public String toString() {
        return rokWydania + "";
    }
}
