package Zad06;

//Stwórz klasę generyczną Counter<T>,
// która będzie zliczać ilość dodanych elementów określonego typu.
// Klasa powinna mieć metodę add(T element),
// która dodaje element do wewnętrznej struktury, oraz metodę getCount(),
// która zwraca liczbę dodanych elementów.
public class Main {
    public static void main(String[] args) {
        Counter<Integer> counter1 = new Counter<>();
        counter1.add(5);
        counter1.add(6);
        counter1.add(4);
        System.out.println(counter1.getCount());
    }
}
