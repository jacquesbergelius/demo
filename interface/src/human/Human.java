package human;/*public interface animal.Animal {
    void eat();
    void sleep();
    void sound();
}*/

public abstract class Human implements Comparable<Human> {
    private String name;
    private int age;
    private static int humanCount;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        humanCount++;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static int getHumanCount() {
        return humanCount;
    }

    abstract void eat();
    abstract void sleep();
    abstract void sound();

    @Override
    public int compareTo(Human other) {
        return (name.compareTo(other.name));
    }
}
