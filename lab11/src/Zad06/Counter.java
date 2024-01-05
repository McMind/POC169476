package Zad06;

import java.util.ArrayList;

public class Counter<T> {
    private ArrayList<T> list;
    private int count;

    public Counter() {
        list = new ArrayList<>();
    }

    public void add(T element) {
        list.add(element);
        count++;
    }

    public int getCount() {
        return count;
    }
}
