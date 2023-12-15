package zad06;

public class Samochod {
    private final Silnik silnik;

    public Samochod(Silnik silnik) {
        this.silnik = silnik;
    }
    public void start(){
        silnik.uruchom();
    }
    public void stop(){
        silnik.zatrzymaj();
    }
}
