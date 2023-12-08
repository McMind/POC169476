public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student("Lucjan",2.6,2);
        Student s2 = (Student) s1.clone();
        System.out.printf("%s %s\n",s1,s2);
        s2.yearOfStudy = 1;
        s2.averageGrade=3.6;
        s2.name = "Natalia";
        System.out.printf("%s %s\n",s1,s2);
    }
}