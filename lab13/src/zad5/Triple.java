package zad5;

public class Triple<T> {
    private T obj1;
    private T obj2;
    private T obj3;

    public Triple(T obj1, T obj2, T obj3) {
        this.obj1 = obj1;
        this.obj2 = obj2;
        this.obj3 = obj3;
    }

    public T getObj1() {
        return obj1;
    }

    public T getObj2() {
        return obj2;
    }

    public T getObj3() {
        return obj3;
    }
}
