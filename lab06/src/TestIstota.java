public class TestIstota {
    public static void main(String[] args) {
        Programista pro1 = new Programista();
    }
}
class Istota{
    public Istota(){
        System.out.println("Istota stworzona");
    }
}
class Czlowiek extends Istota{
    public Czlowiek(){
        System.out.println("Człowiek stworzony");
    }
}
class Programista extends Czlowiek{
    public Programista(){
        System.out.println("Programista stworzony");
    }
}