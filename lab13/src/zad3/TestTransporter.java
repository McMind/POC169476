package zad3;

public class TestTransporter {
    public static void main(String[] args) {
        TransportCompany transportCompany1 = new TransportCompany(new Car());
        TransportCompany transportCompany2 = new TransportCompany(new Helicopter());
        transportCompany1.transportTo("Olsztyn");
        transportCompany2.transportTo("Las Vegas");
    }
}
