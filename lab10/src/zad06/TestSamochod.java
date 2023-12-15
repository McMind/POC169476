package zad06;

public class TestSamochod {
    public static void main(String[] args) {
        Samochod samochod = new Samochod(new BenzynowySilnik());
        samochod.start();
        samochod.stop();
    }
}
