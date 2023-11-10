public class TestPerson {
    public static void main(String[] args) {
        Employee pracownik = new Employee("Adam","Kowalski");
        pracownik.displayData();
    }
}
class Person{
    private String firstName;
    protected String lastName;

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
class Employee extends Person{

//    public String getFirstName(){
//        return super.firstName;
//    }
    public Employee(String firstName, String lastName){
        super(firstName,lastName);
    }
    public String getLastName(){ //redundant
        return super.lastName;
    }

    public void displayData(){
        System.out.printf("Imię: %s, Nazwisko: %s",
                super.getFirstName(),
                super.getLastName());
    }
}
