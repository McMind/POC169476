package zad5;

public class Dog extends Canine {
    private int b;

    public Dog(int a, int b) {
        super(a);
        this.b = b;
    }

    public int getB() {
        return b;
    }
}
