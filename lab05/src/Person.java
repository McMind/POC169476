public class Person {
    public String firstName;
    public String lastName;
    public int age;
    public Person(String firstName,String lastName,int age){
        if(age < 0){
            this.age = 0;
        }else{
            this.age = age;
        }
        if(firstName == null || firstName.isEmpty()){
            this.firstName = "";
        }else{
            this.firstName = firstName;
        }
        if(lastName == null || lastName.isEmpty()){
            this.lastName = "";
        }else{
            this.lastName = lastName;
        }
    }
    @Override
    public String toString(){
        return "Person: " + this.firstName +
                " " + this.lastName + ", Age: " +
                this.age + ".";
    }
    @Override
    public boolean equals(Object obiekt){
        if(obiekt instanceof Person temp){
            return (this.age == temp.age &&
                    this.firstName.equals(temp.firstName) &&
                    this.lastName.equals(temp.lastName));
        }
        return false;
    }
}
