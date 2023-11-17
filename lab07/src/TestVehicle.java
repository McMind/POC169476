public class TestVehicle {
    public static void main(String[] args) {

    }
}

class Vehicle{
    String brand;
    String model;

    public Vehicle(String brand,String model){
        this.brand = brand;
        this.model = model;
    }
    public void drive(){
        System.out.println("The vehicle is moving.");
    }
}

class Car extends Vehicle{
    int numberOfDoors;

    public Car(String brand, String model, int numberOfDoors){
        super(brand,model);
    }

    @Override
    public void drive(){
        super.drive();
        System.out.println("The car");
    }
}