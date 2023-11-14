import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k;

        try {
            Thread.sleep(500);
            k = scanner.nextInt();
            System.out.println(5 / k);
        } catch (ArithmeticException e) {
            //System.out.println(e.getMessage());
            System.out.println("The result is undefined");
        } catch (InputMismatchException e) {
            System.out.println("Please give a valid number");
        } catch (InterruptedException e) {}

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {}

    }
}
