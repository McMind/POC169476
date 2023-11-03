public class Vehicle {
    public String brand;
    public String model;
    public int yearOfProduction;
    public Vehicle(String brand, String model, int yearOfProduction){
        if(yearOfProduction > 2023){
            this.yearOfProduction = 2023;
        }else{
            this.yearOfProduction = yearOfProduction;
        }
        if(brand == null || brand.isEmpty()){
            this.brand = "";
        }else{
            this.brand = brand;
        }
        if(model == null || model.isEmpty()){
            this.model = "";
        }else{
            this.model = model;
        }
    }
    public String toString(){
        return "Vehicle: " + this.brand +
                " " + this.model + ", Year: " +
                this.yearOfProduction + ".";
    }
    @Override
    public boolean equals(Object obiekt){
        if(obiekt instanceof Vehicle temp){
            return (this.yearOfProduction == temp.yearOfProduction &&
                    this.brand.equals(temp.brand) &&
                    this.model.equals(temp.model));
        }
        return false;
    }
}
