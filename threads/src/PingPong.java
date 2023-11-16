public class PingPong extends Thread {
    private String word;    // what word to print
    private int    delay;   // how long to pause

    public PingPong(String whatToSay, int delayTime) {
        word = whatToSay;
        delay = delayTime;
    }

    public void run() {
        try {
            while (true) {
                System.out.print(word + " ");
                Thread.sleep(delay);    // wait until next time
            }
        } catch (InterruptedException e) {
            return;                     // end this thread
        }
    }

    public static void main(String[] args) {
        Thread pp = new PingPong("ping", 33);
        pp.start();   // 1/30 second
        new PingPong("PONG", 100).start();  // 1/10 second

        while (true) {
            System.out.println("Hello World!");
            // delay of 500 milliseconds
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}