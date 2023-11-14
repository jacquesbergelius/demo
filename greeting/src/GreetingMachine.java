public class GreetingMachine {

    public void greet() {
        System.out.println("Hello World!");
    }

    public void greet(String message) {
        System.out.println(message + "!");
    }

    public static void main(String[] args) {
        GreetingMachine gm = new GreetingMachine();
        gm.greet();
        gm.greet("Good Morning Universe");
    }
}