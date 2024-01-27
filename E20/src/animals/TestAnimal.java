package animals;

import static animals.SameSpecies.isSameSpecies;

public class TestAnimal {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Animal animal = new Animal();
        Animal dog2 = new Dog();
        System.out.println(isSameSpecies(dog,dog2));
    }
}
