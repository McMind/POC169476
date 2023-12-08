import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Student implements Comparable<Student>, Cloneable {
    String name;
    int yearOfStudy;
    double averageGrade;

    public Student(String name, double averageGrade, int yearOfStudy) {
        this.name = name;
        this.yearOfStudy = yearOfStudy;
        this.averageGrade = averageGrade;
    }

    public Student(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public Student(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    public Student( double averageGrade, int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
        this.averageGrade = averageGrade;
    }

    @Override
    public String toString() {
        return "Name: " + name +
                ", Year:" + yearOfStudy +
                ", [" + averageGrade +
                ']';
    }

    @Override
    public int compareTo(Student o) {
        int compare = Double.compare(o.averageGrade, this.averageGrade);
        if(compare == 0){
            return Integer.compare(this.yearOfStudy,o.yearOfStudy);
        }
        return compare;
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(4.0,2));
        students.add(new Student(3.8,2));
        students.add(new Student(4.6,1));
        students.add(new Student(4.0,1));
        System.out.println(students);
        Collections.sort(students);
        System.out.println(students);
        ArrayList<Student> students2 = new ArrayList<>();
        students2.add(new Student(4.0,2));
        students2.add(new Student(3.8,2));
        students2.add(new Student(4.6,1));
        students2.add(new Student(4.0,1));
        students.sort(new StudentYearComparator());
        System.out.println(students2);
    }

    /*@Override
    public Student clone() {
        try {
            Student clone = (Student) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }*/
    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
class StudentAverageGradeComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o2.averageGrade, o1.averageGrade);
    }
}
class StudentYearComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.yearOfStudy, o2.yearOfStudy);
    }
}
