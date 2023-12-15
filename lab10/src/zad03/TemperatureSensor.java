package zad03;

public class TemperatureSensor implements Sensor{
    double temperature;
    @Override
    public double readValue() {
        return temperature;
    }

    @Override
    public String getStatus() {
        return "Temperature status: " + temperature;
    }

    @Override
    public void reset() {
        this.temperature = 0;
    }
    public TemperatureSensor(double temperature){
        this.temperature = temperature;
    }
}
