public class Main {
    public static boolean isEven(int number) {
        return ((number % 2) == 0);
    }

    public static int addOne(int number) {
        return number + 1;
    }

    public static int multiplyByTwo(int number) {
        return Math.abs(number) * 2;    // intentionally incorrect implementation
    }

    public static double commathree() {
        return 0.1 + 0.2;
        //return 0.5 + 0.25;
    }

    public static void main(String[] args) {
        int n = 3;

        if (addOne(6) == 7)
            System.out.println("Hyvin kävi");
        else
            System.out.println("Virhe!");

        //System.out.println("Number " + n + " is even: " + isEven(n));
    }
}