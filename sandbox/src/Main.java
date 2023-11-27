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
    public static final int[] tf(int[] a) {
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i] * a[i];
        }
        return b;
    }
    public static void main(String[] args) {

        int zz[] = tf(new int[]{1, 2, 3}); // anonymous array (an initialization list needs the new-operator)

        try {
            f();
        } catch (Exception e) {
            System.out.println("Something went wrong");
            e.printStackTrace();
        }
    }
}
