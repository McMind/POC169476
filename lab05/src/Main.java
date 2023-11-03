public class Main {
    public static void main(String[] args) {
//        Person osoba = new Person("imie","nazwisko",5);
//        Person osoba2 = new Person("imie","nazwisko",5);
//        System.out.println(osoba);
//        System.out.println(osoba.equals(osoba2));
//        Vehicle pojazd = new Vehicle(null,null,2024);
//        Vehicle pojazd2 = new Vehicle("Toyota","Yaris",2015);
//        System.out.println(pojazd2);
//        System.out.println(pojazd.equals(pojazd2));
//        Book ksiazka = new Book("Harry Potter","JKR",300);
//        Book ksiazka2 = new Book(null,null,-1);
//        System.out.println(ksiazka);
//        System.out.println(ksiazka.equals(ksiazka2));
        Rectangle prostokat = new Rectangle(45,55);
        System.out.println(prostokat.getWidth());
        System.out.println(prostokat.perimeter());
        Student student = new Student("imie","nazwisko",123213, 3, 3.5);
        student.showInformation();
    }
}