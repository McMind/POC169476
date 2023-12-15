package zad03;

public class SensorTest {
    public static void main(String[] args) {
        TemperatureSensor temperatureSensor = new TemperatureSensor(20.0);
        System.out.println(temperatureSensor.getStatus());
        temperatureSensor.reset();
        PressureSensor pressureSensor = new PressureSensor(1013);
        System.out.println(pressureSensor.readValue());
        System.out.println(temperatureSensor.readValue());
    }
}
