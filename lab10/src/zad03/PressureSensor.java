package zad03;

public class PressureSensor implements Sensor{

    double pressure;
    @Override
    public double readValue() {
        return pressure;
    }

    @Override
    public String getStatus() {
        return "Pressure status: " + pressure;
    }

    @Override
    public void reset() {
        this.pressure = 1000;
    }

    public PressureSensor(double pressure) {
        this.pressure = pressure;
    }
}
