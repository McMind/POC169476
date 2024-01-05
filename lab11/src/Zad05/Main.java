package Zad05;
//Napisz generyczną metodę isEqual,
// która przyjmuje dwa dowolne obiekty tego samego typu i zwraca true,
// jeśli są one równe, w przeciwnym razie false.
public class Main {
    public static void main(String[] args) {
        Integer a = 5;
        Integer b = 4;
        System.out.println(isEqual(a,b));
        Double d = 0.3;
        Double e = 0.3;
        System.out.println(isEqual(d,e));
        String g = "abc";
        String h = "abc";
        String i = "abe";
        System.out.println(isEqual(g,i));
    }
    public static<T> boolean isEqual(T obj1, T obj2){
        return obj1.equals(obj2);
    }
}
