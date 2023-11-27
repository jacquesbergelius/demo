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

    public static void main(String[] args) {
        int n = 3;

        System.out.println("Number " + n + " is even: " + isEven(n));
    }
}