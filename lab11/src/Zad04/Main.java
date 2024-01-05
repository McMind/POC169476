package Zad04;

//Stwórz klasę generyczną Triple<T, U, V>,
// która może przechowywać trzy obiekty różnych typów.
// Zaimplementuj metody getFirst(), getSecond() i getThird()
// do pobierania odpowiednio pierwszego, drugiego i trzeciego elementu.
public class Main {
    public static void main(String[] args) {
        Integer a = 5;
        Double b = 6.5;
        String c = "abc";
        Triple<Integer,Double,String> t1 = new Triple<>(a,b,c);
        System.out.println(t1.getFirst());
    }
}
