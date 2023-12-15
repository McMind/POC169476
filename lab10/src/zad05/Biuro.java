package zad05;

public class Biuro{
    private final Printer printer;

    public Biuro(Printer printer){
        this.printer = printer;
    }
    public void drukujDokument(String tekst){
        printer.drukuj(tekst);
    }
}
