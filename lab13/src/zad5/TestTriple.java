package zad5;

public class TestTriple {
    public static void main(String[] args) {
        Triple<Canine> triple1 = new Triple<>(new Canine(5),new Canine(4),new Canine(6));
        System.out.println(findMin(triple1).getA());
    }
    public static Canine findMin(Triple<? extends Canine> triple){
        if(triple.getObj1().getA() < triple.getObj2().getA()){
            return triple.getObj1();
        }
        return triple.getObj2();
    }
}
