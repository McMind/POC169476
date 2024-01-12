package zad05;

public class Circle extends Shape {

    int diameter;
    public Circle(int size, int diameter) {
        super(size);
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return size + "";
    }
}
