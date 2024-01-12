package zad04;

public class TestTeacher {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Jan","matematyka",25);
        Teacher teacher2;
        try{
            teacher2 = (Teacher) teacher1.clone();
            teacher2.experience = 30;
            System.out.println(teacher1);
            System.out.println(teacher2);
        }catch(CloneNotSupportedException e){
            System.out.println("Błąd: " + e.getMessage());
        }
    }
}
