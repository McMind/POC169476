public class TestAnimal {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Zebra");
        Animal animal2 = new Animal("Zebra");
        System.out.println(animal1);
        System.out.println(animal1.equals(animal2));
        Cat kot = new Cat("Filemon");
        kot.makeNoise();
        Animal animal3 = new Cat("Bonifacy");
        //Cat kot2 = new Animal("Burek"); //tak nie wolno
    }
}
class Animal{

    public String name;

    public Animal(){

    }
    public Animal(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }

    @Override
    public boolean equals(Object other){
        if(other instanceof Animal temp){
            return this.name.equals(temp.name);
        }
        return false;
    }

    public void makeNoise(){
        System.out.println("Jakiś dźwięk zwierzęcia");
    }
}

class Cat extends Animal{
    public Cat(){

    }
    public Cat(String name){
        super(name);
    }

    @Override
    public void makeNoise(){
        System.out.println("Miał miał");
    }
}
