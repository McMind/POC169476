public class Osoba2 {
    public String imie;
    public static int licznik;

    public Osoba2(){
        this("default");
    }
    public Osoba2(String imie){
        this.imie = imie;
        licznik += 1;
    }
    public static int getLicznik(){
        return licznik;
    }
}
