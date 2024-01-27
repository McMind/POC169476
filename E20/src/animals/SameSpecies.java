package animals;

public class SameSpecies {
    public static <T extends Animal> boolean isSameSpecies(T animal1,T animal2){
        return animal1.getClass() == animal2.getClass();
    }
}
