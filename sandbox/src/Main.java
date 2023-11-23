public class Main {
    private static void f() {
        int k = 5;
        double a = 1.0/3.0+100, b = 6.6, c = 7.7;
        float d = 1.0f/3.0f;

        System.out.println("Hello, World!, the value of k is " + (k + 1));
        System.out.println("The value of a is " + a);
        System.out.println("The value of d is " + d);
        System.out.printf("The value of a is %6.2f, the value of b is %6.2f\n", a, b);
        System.out.printf("Integer print %02d:%02d %s, then blabla\n", k, k + 7);
    }
    public static void main(String[] args) {

        try {
            f();
        } catch (Exception e) {
            System.out.println("Something went wrong");
            e.printStackTrace();
        }
    }
}
