import java.util.ArrayList;
import java.util.Scanner;

public class AutoTest {
    private static final String input = "one\n" + "two\n" +
            "three\n" + "four\n" +
            "five\n" + "onez\n" +
            "six\n" + "one\n";

    public static void main(String[] args) {
        Scanner reader = new Scanner(input);    // Not System.in, but a string!

        ArrayList<String> read = new ArrayList<>();

        while (true) {
            System.out.println("Enter an input: ");
            String line = reader.nextLine();
            if (read.contains(line)) {
                break;
            }

            read.add(line);
        }

        System.out.println("Thank you!");

        if (read.contains("six")) {
            System.out.println("A value that should not have been added to the group was added to it.");
        }
    }
}