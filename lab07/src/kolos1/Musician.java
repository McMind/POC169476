package kolos1;

import java.util.Objects;

//stwórz klasę Musician, która przyjmuje pola name i bandName (typu String)
//stwórz klasę Guitarist, która dziedziczy po klasie Musician z dodatkowym polem guitarModel (typu String)
//dodaj konstruktory domyślne i takie, które przyjmują w argumencie wszystkie pola (w klasie Guitarist skorzystaj z dziedziczenia(jakoś tak))
//stwórz metody toString i equals w obu klasach
//w klasie Musician napisz metodę writeSong, która przyjmuje jako argument liczbę całkowitą n. Metoda zwraca typ StringBuilder i ma dodać słowo "la" tyle razy, ile wynosi liczba n podana w argumencie, np. "lalalala" dla n=4.
//w klasie Guitarist nadpisz metodę writeSong tak, żeby co drugie słowo "la" było samymi dużymi literami, np. "laLAlaLA" dla n=4.
//przetestuj wszystkie metody w oddzielnej klasie Main
public class Musician {
    public String bandName;
    public String name;
    public Musician(){

    }

    public Musician(String bandName, String name) {
        this.bandName = bandName;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Musician{" +
                "bandName='" + bandName + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Musician musician = (Musician) o;
        return Objects.equals(bandName, musician.bandName) && Objects.equals(name, musician.name);
    }
    ////w klasie Musician napisz metodę writeSong, która przyjmuje jako argument liczbę całkowitą n.
    // Metoda zwraca typ StringBuilder
    // i ma dodać słowo "la" tyle razy, ile wynosi liczba n podana w argumencie, np. "lalalala" dla n=4.
    public StringBuilder writeSong(int n){
        StringBuilder wyjscie = new StringBuilder();
        String napis = "la";
        wyjscie.append(napis.repeat(n));
        return wyjscie;
    }
}
class Guitarist extends Musician{
    public String guitarModel;
    public Guitarist(){
        super();
    }
    public Guitarist(String bandName, String name, String guitarModel){
        super(bandName, name);
        this.guitarModel = guitarModel;
    }
    @Override
    public String toString() {
        return "Guitarist{" +
                "guitarModel='" + guitarModel + '\'' +
                ", bandName='" + bandName + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Guitarist guitarist = (Guitarist) o;
        return Objects.equals(bandName, guitarist.bandName) &&
                Objects.equals(name, guitarist.name) &&
                Objects.equals(guitarModel, guitarist.guitarModel);
    }
    @Override
    public StringBuilder writeSong(int n){
        StringBuilder wyjscie = new StringBuilder();
        String napis = "la";
        for(int i = 0; i < n; i++){
            wyjscie.append((i % 2 == 0) ? (napis) : (napis.toUpperCase()));
        }
        return wyjscie;
    }
}
