package zad05;

// Stwórz klasę generyczną ElementPair<T>,
// która przechowuje dwa obiekty tego samego typu.
// Utwórz dwie klasy: Shape i Circle, gdzie Circle dziedziczy po Shape.
// Następnie napisz statyczną metodę generyczną findLargest,
// która przyjmuje ElementPair<? extends Shape>.
// Metoda powinna zwracać element większy według własnie zdefiniowanego kryterium porównania.
public class TestMain {
    public static void main(String[] args) {
        ElementPair<Circle> c1 = new ElementPair<>(new Circle(5,4),new Circle(2,6));
        System.out.println(findLargest(c1).getClass().getSimpleName());
    }
    public static Shape findLargest(ElementPair<? extends Shape> pair){
        if(pair.obj1.size > pair.obj2.size){
            return pair.obj1;
        }
        return pair.obj2;
    }
}
