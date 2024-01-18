package zad3;

public class Car implements Transporter {
    @Override
    public void moveTo(String information) {
        System.out.println("Driving to: " + information);
    }
}
