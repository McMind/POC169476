import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Produkt implements Comparable<Produkt> {
    String nazwa;
    double cena;
    LocalDate dataProdukcji;

    public Produkt(LocalDate dataProdukcji) {
        this.dataProdukcji = dataProdukcji;
    }

    @Override
    public String toString() {
        return "{" +
                "dataProdukcji=" + dataProdukcji +
                '}';
    }

    @Override
    public int compareTo(Produkt o) {
        return this.dataProdukcji.compareTo(o.dataProdukcji);
    }

    public static void main(String[] args) {
        ArrayList<Produkt> produkty = new ArrayList<>();
        produkty.add(new Produkt(LocalDate.of(2023,12,8)));
        produkty.add(new Produkt(LocalDate.of(2022,12,6)));
        produkty.add(new Produkt(LocalDate.of(2021,12,5)));
        produkty.add(new Produkt(LocalDate.of(2023,11,7)));
        System.out.println(produkty);
        Collections.sort(produkty);
        System.out.println(produkty);
    }
}
