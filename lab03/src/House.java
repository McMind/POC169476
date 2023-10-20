public class House {
    public int area;
    public int rooms;
    public int floors;
    public boolean hasGarage;
    public boolean hasGarden;

    public int getPrice(){
        return area * 3000;
    }
}
