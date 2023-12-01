// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Person2 p1 = new Person2("Bogdan",26);
        Person2 p2 = new Person2("Bogdan",-15);
        System.out.println(p2.age());
        Person2.greet();
    }
}