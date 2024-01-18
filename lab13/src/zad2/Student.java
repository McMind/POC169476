package zad2;

public class Student implements Comparable<Student> {
    private String name;
    private int averageGrade;
    private int yearOfStudy;

    @Override
    public int compareTo(Student o) {
        if (Integer.compare(o.averageGrade, this.averageGrade) == 0) {
            return Integer.compare(this.yearOfStudy, o.yearOfStudy);
        }
        return Integer.compare(o.averageGrade, this.averageGrade);
    }

    public String getName() {
        return name;
    }

    public int getAverageGrade() {
        return averageGrade;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    @Override
    public String toString() {
        return averageGrade + " "
                + yearOfStudy;
    }

    public Student(String name, int averageGrade, int yearOfStudy) {
        this.name = name;
        this.averageGrade = averageGrade;
        this.yearOfStudy = yearOfStudy;
    }
}
