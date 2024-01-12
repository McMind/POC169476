package zad02;
//Napisz klasę Course, która zawiera pola: name (typu String), numberOfHours (typu int) i price (typu double).
// Zaimplementuj interfejs Comparable w taki sposób,
// aby obiekty klasy Course były sortowane według jednego kryterium: rosnąco według liczby godzin,
// a przy równości sortowane były malejąco według ceny. Stwórz tablicę 4 obiektów klasy Course i
// posortuj ją według sprecyzowanego kryterium.
public class Course implements Comparable<Course> {
    String name;
    int numberOfHours;
    double price;

    public Course(String name, int numberOfHours, double price) {
        this.name = name;
        this.numberOfHours = numberOfHours;
        this.price = price;
    }

    @Override
    public String toString() {
        return numberOfHours +
                " " + price;
    }

    @Override
    public int compareTo(Course o) {
        if(this.numberOfHours == o.numberOfHours){
            return Double.compare(o.price,this.price);
        }
        return Integer.compare(this.numberOfHours,o.numberOfHours);
    }
}
