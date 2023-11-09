package animal;

public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("animal.Cat is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("animal.Cat is sleeping.");
    }

    public void sound() {
        System.out.println("Miau!");
    }
}