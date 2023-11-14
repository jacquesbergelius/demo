package human;

public class Man extends Human {
    private final double BEAST = 666;

    public Man(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("human.Man is eating.");
    }

    @Override
    public void sleep() {
        System.out.println("human.Man is sleeping.");
    }

    public void sound() {
        System.out.println("Fart");
    }
}
