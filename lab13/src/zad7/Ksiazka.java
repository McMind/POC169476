package zad7;

public class Ksiazka {
    private String tytul;
    private double cena;
    private int rokWydania;

    public Ksiazka(String tytul, double cena, int rokWydania) {
        this.tytul = tytul;
        this.cena = cena;
        this.rokWydania = rokWydania;
    }

    public String getTytul() {
        return tytul;
    }

    public double getCena() {
        return cena;
    }

    public int getRokWydania() {
        return rokWydania;
    }

    @Override
    public String toString() {
        return rokWydania + "";
    }
}
