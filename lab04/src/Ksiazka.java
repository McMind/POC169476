public class Ksiazka {
    public String tytul;
    public String autor;
    public int rokWydania;

    public Ksiazka(){
        this.tytul = "Default";
        this.autor = "Default";
        this.rokWydania = 2023;
    }
    public Ksiazka(String tytul,String autor,int rokWydania){
        this.tytul = tytul;
        this.autor = autor;
        this.rokWydania = rokWydania;
    }
}
