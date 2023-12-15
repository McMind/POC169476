package zad06;

public class BenzynowySilnik implements Silnik{
    @Override
    public void uruchom() {
        System.out.println("Odpalanie benzyniaka");
    }

    @Override
    public void zatrzymaj() {
        System.out.println("Gaszenie benzyniaka");
    }
}
