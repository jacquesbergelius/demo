package animal;/*public interface animal.Animal {
    void eat();
    void sleep();
    void sound();
}*/

public abstract class Animal implements Comparable<Animal> {
    private String name;
    private int age;
    private static int animalCount;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        animalCount++;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static int getAnimalCount() {
        return animalCount;
    }

    public abstract void eat();
    public abstract void sleep();
    public abstract void sound();

    @Override
    public int compareTo(Animal other) {
        return (name.compareTo(other.name));
    }
}
