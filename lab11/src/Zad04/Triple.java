package Zad04;

public class Triple<T, U, V> {
    private T obj1;
    private U obj2;
    private V obj3;

    public Triple(T obj1, U obj2, V obj3) {
        this.obj1 = obj1;
        this.obj2 = obj2;
        this.obj3 = obj3;
    }

    public T getFirst() {
        return obj1;
    }

    public U getSecond() {
        return obj2;
    }

    public V getThird() {
        return obj3;
    }
}
