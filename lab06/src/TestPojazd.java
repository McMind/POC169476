public class TestPojazd {
    public static void main(String[] args) {
        Samochod auto1 = new Samochod();
        auto1.jedz();
    }
}
class Pojazd{
    public void jedz(){
        System.out.println("Pojazd jedzie");
    }
}
class Samochod extends Pojazd{
    public void jedz(){
        super.jedz();
        System.out.println("Samochód jedzie");
    }
}
