public class TestKalkulator {
    public static void main(String[] args) {
        KalkulatorRozszerzony k1 = new KalkulatorRozszerzony();
        System.out.println(k1.dodaj(1,2));
    }
}
class Kalkulator{
    public int dodaj(int a, int b){
        return (a + b);
    }
}
class KalkulatorRozszerzony extends Kalkulator{
    //@Override
    public int dodaj(int a, int b, int c){ //to jest przeciążenie metody a nie przesłonienie
        return (a + b + c);
    }
}