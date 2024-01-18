package zad2;

import java.util.ArrayList;
import java.util.Collections;

public class TestStudent {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("a", 4, 3));
        students.add(new Student("a", 5, 2));
        students.add(new Student("a", 4, 2));
        System.out.println(students);
        Collections.sort(students);
        System.out.println(students);
    }
}
