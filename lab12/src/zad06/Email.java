package zad06;

public class Email implements Powiadomienie {
    @Override
    public void wyslij(String wiadomosc) {
        System.out.println("Treść wiadomości email wyslanej: " + wiadomosc);
    }
}
