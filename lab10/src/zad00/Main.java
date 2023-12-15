package zad00;

public class Main {
    public static void main(String[] args) {
        KierownikPodrozy kierownik = new KierownikPodrozy(new LotKrajowy());
        kierownik.wystawBilet();
        kierownik = new KierownikPodrozy(new KoncertSymfoniczny());
        kierownik.wystawBilet();
        kierownik = new KierownikPodrozy(new BramkaNaAutostradzie());
        kierownik.wystawBilet();
    }
}