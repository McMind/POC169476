package zad3;

public class Helicopter implements Transporter {

    @Override
    public void moveTo(String information) {
        System.out.println("Flying to: " + information);
    }
}
