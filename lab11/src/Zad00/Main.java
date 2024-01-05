package Zad00;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();

        Box<Animal, Integer> box = new Box<>(animal, 14);
        box.value.dajGlos();
        Box<Animal, Animal> box2 = new Box<>(animal, animal);
        wypisz(animal);
    }
    public static<T> void wypisz(T value){
        System.out.println(value);
    }
}