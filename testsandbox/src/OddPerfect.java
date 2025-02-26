public class OddPerfect {
    public static void main(String[] args) {
        int k = 1, j = 1;

        System.out.println("Starting to found odd perfect numbers...");
        for (int i = 1; --j != 0 || k != 0; k = j != 0 ? i % j != 0 ? k : k-j : (j=i+=2));
        System.out.println("Odd perfect number found!");
    }
}
