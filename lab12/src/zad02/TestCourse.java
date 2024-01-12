package zad02;

import java.util.ArrayList;
import java.util.Collections;

public class TestCourse {
    public static void main(String[] args) {
        ArrayList<Course> c = new ArrayList<>();
        c.add(new Course("aa",5,254.5));
        c.add(new Course("bb",4,254.5));
        c.add(new Course("cc",3,168.5));
        c.add(new Course("dd",4,312.3));
        System.out.println(c);
        System.out.println();
        Collections.sort(c);
        System.out.println(c);
    }
}
