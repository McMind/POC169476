package zad02;

public class Main {
    public static void main(String[] args) {
        TestMyComparator comparator = new TestMyComparator();
        System.out.println(comparator.compare(5,4));
        System.out.println(comparator.compare(3,3));
        System.out.println(comparator.compare(2,5));
    }
}
