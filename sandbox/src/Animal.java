public interface Animal {
    public void eat();
    public void sleep();
}


class KoeLuokka {
    public static void main(String[] args) {
        Animal animal = new Animal() {
            public void eat() {}
            public void sleep() {}
        };
        animal.eat();

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
    }
}
