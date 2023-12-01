import java.util.Objects;

public class TestAnimal {
    public static void main(String[] args) {
        Animal zw1 = new Animal(1,13.,"Zebra");
        Animal zw2 = new Animal(2,13.,"Zebra");
        System.out.printf("#1: %d #2: %d\n",zw1.hashCode(),zw2.hashCode());
    }
}
class Animal{
    int age;
    double weight;
    String name;

    public Animal(int age, double weight, String name) {
        this.age = age;
        this.weight = weight;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Double.compare(weight, animal.weight) == 0 && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        int p = 29;
        int result = 11;
        result *= p;
        result += age;
        long doubleToLong = Double.doubleToLongBits(weight);
        result *= p;
        result += (int)(doubleToLong ^ (doubleToLong >>> 32));
        result *= p;
        result += name.hashCode();
        return result;
    }
}