import java.util.Scanner;

class ContinuousCounter implements Runnable {
    private int counter;

    ContinuousCounter() {
        counter = 1;
    }

    public void run() {
        try {
            while (true) {
                System.out.println(counter++);
                Thread.sleep(1000);  // write one value/second
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
            return;
        }
    }

    public static void main(String[] args) {
        String s = "";
        Scanner scanner = new Scanner(System.in);
        ContinuousCounter cc = new ContinuousCounter();
        Thread t = new Thread(cc);
        t.start();
        System.out.println("Press q to quit");

        do {
            s = scanner.nextLine();
            //System.out.println("You typed: " + s);
        } while (!s.equals("q"));
        t.interrupt();
        System.out.println("Quitting...");
    }
}
