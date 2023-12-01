public record Person2(String name, int age) {
    public static int counter;
    public Person2{
        age = Math.max(age, 0);
        counter++;
    }
    public Person2(){
        this("default",0);
    }
    public static void greet(){
        System.out.println("cześć");
    }
}
