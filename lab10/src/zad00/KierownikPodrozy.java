package zad00;

public class KierownikPodrozy implements Biletomat {
    Biletomat biletomat;

    public KierownikPodrozy(Biletomat biletomat){
        this.biletomat = biletomat;
    }

    @Override
    public void wystawBilet() {
        biletomat.wystawBilet();
    }
}
