import java.util.ArrayList;

public class Athlete implements Cloneable {
    private String name;
    private ArrayList<Integer> lapTimes;

    public Athlete(String name) {
        this.name = name;
        this.lapTimes = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Integer> getLapTimes() {
        return new ArrayList<>(lapTimes);
    }
    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public void setLapTimes(ArrayList<Integer> lapTimes) {
        this.lapTimes = lapTimes;
    }
    public void addLapTimes(Integer lapTime){
        this.lapTimes.add(lapTime);
    }

    @Override
    public String toString() {
        return "Athlete{" +
                "name='" + name + '\'' +
                ", lapTimes=" + lapTimes +
                '}';
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Athlete a1 = new Athlete("Karol");
        a1.addLapTimes(180);
        a1.addLapTimes(124);
        a1.addLapTimes(214);
        Athlete a2 = (Athlete) a1.clone();
        a2.addLapTimes(155);
        System.out.println(a1);
        System.out.println(a2);
    }
}
