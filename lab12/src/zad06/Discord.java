package zad06;

public class Discord implements Powiadomienie{
    @Override
    public void wyslij(String wiadomosc) {
        System.out.println("Treść wiadomości Discord: " + wiadomosc);
    }
}
