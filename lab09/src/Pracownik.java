import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Pracownik implements Comparable<Pracownik> {
    public String imie;
    public double pensja;
    public LocalDate dataZatrudnienia;

    public Pracownik(double pensja) {
        this.pensja = pensja;
    }

    @Override
    public String toString() {
        return "{" +
                "pensja=" + pensja +
                '}';
    }

    @Override
    public int compareTo(Pracownik o) {
        return Double.compare(this.pensja,o.pensja);
    }

    public static void main(String[] args) {
        ArrayList<Pracownik> pracownicy = new ArrayList<>();
        pracownicy.add(new Pracownik(3400.5));
        pracownicy.add(new Pracownik(1400.5));
        pracownicy.add(new Pracownik(8400.5));
        pracownicy.add(new Pracownik(5400.5));
        System.out.println(pracownicy);
        Collections.sort(pracownicy);
        System.out.println(pracownicy);
    }
}
