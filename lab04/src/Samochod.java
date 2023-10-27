import java.time.Year;

public class Samochod {
    public String marka;
    public String model;
    public Year rokProdukcji;

    public Samochod(){

    }
    public Samochod(String marka, String model){
        this.marka = marka;
        this.model = model;
    }
    public Samochod(String marka, String model, Year rokProdukcji){
        this.marka = marka;
        this.model = model;
        this.rokProdukcji = rokProdukcji;
    }
}
