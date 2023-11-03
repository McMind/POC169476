public class Student {
    private String firstName;
    private String lastName;
    private int indexNumber;
    private int yearOfStudy;
    private double gradeAverage;
    public Student(String firstName, String lastName, int indexNumber, int yearOfStudy, double gradeAverage){
        this.firstName = firstName;
        this.lastName = lastName;
        this.indexNumber = indexNumber;
        this.yearOfStudy = yearOfStudy;
        this.gradeAverage = gradeAverage;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getIndexNumber(){
        return indexNumber;
    }
    public int getYearOfStudy(){
        return yearOfStudy;
    }
    public double getGradeAverage(){
        return gradeAverage;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setIndexNumber(int indexNumber){
        this.indexNumber = indexNumber;
    }
    public void setYearOfStudy(int yearOfStudy){
        this.yearOfStudy = yearOfStudy;
    }
    public void setGradeAverage(double gradeAverage){
        this.gradeAverage = gradeAverage;
    }
    public void showInformation(){
        System.out.println(this.firstName + " " + this.lastName +
                " nr indeksu: " + this.indexNumber + " rok studiów: " + this.yearOfStudy +
                " średnia ocen: " + this.gradeAverage);
    }
}
