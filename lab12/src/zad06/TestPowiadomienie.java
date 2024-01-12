package zad06;

public class TestPowiadomienie {

    public static void main(String[] args) {
        Discord discord = new Discord();
        Email email = new Email();
        Uzytkownik u1 = new Uzytkownik(discord);
        Uzytkownik u2 = new Uzytkownik(email);
        u1.powiadomOModernizacji("Informacja1");
        u2.powiadomOModernizacji("Informacja2");
    }
}
