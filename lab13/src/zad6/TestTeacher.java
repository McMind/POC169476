package zad6;

public class TestTeacher {
    public static void main(String[] args) {
        try {
            Teacher teacher = new Teacher("aaa", "bbb", 5);
            Teacher teacher2 = (Teacher) teacher.clone();
            teacher.setExperience(25);
            System.out.println(teacher.getExperience());
            System.out.println(teacher2.getExperience());
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
    }
}
