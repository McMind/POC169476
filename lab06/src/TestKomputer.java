public class TestKomputer {
    public static void main(String[] args) {

    }
}
class Komputer{
    public void uruchom(){
        System.out.println("Komputer uruchomiony");
    }
}
class Laptop extends Komputer{
//    protected void uruchom(){ //nie mozna przeslonic public protected
//        System.out.println("Laptop uruchomiony");
//    }
    public void uruchom(){
        System.out.println("Laptop uruchomiony");
    }
}
