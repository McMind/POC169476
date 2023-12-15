package zad05;

public class TestPrinter {
    public static void main(String[] args) {
        Biuro biuro = new Biuro(new StandardowyPrinter());
        biuro.drukujDokument("Testowy tekst");
    }
}
