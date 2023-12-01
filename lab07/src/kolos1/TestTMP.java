package kolos1;

import java.util.ArrayList;

public class TestTMP {
    public static void main(String[] args) {
        TemperatureHistory historia = new TemperatureHistory();
        historia.addTemperature(1);
        historia.addTemperature(2);
        historia.addTemperature(3);
        System.out.println(historia.averageTemperature());
        historia.removeTemperature(0);
        System.out.println(historia.averageTemperature());
    }
}
//Stwórz klasę TemperatureHistory z prywatnym polem temperatures (jako ArrayList
//typu double). Dodaj konstruktor domyślny. Dodaj metody dostępowe (gettery i settery) oraz metody addTemperature(double temperature) i removeTemperature(int
//index), które odpowiednio dodają lub usuwają temperaturę z listy temperatur. Dodaj
//również metodę averageTemperature() do obliczania i zwracania średniej temperatur.
class TemperatureHistory{
    private ArrayList<Double> temperatures;

    public TemperatureHistory(){
        temperatures = new ArrayList<Double>();
    }

    public ArrayList<Double> getTemperatures() {
        return temperatures;
    }

    public void setTemperatures(ArrayList<Double> temperatures) {
        this.temperatures = temperatures;
    }

    public void addTemperature(double temperature){
        temperatures.add(temperature);
    }
    public void removeTemperature(int index){
        temperatures.remove(index);
    }

    public double averageTemperature(){
        double sum = 0;
        for(int i = 0; i < temperatures.size(); i++){
            sum += temperatures.get(i);
        }
        return sum / temperatures.size();
    }
}
