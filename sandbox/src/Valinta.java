import java.util.ArrayList;

class Valinta implements Runnable {
    public void run() {
        double x = 0.7;
        while (true)
            x = Math.cos(x);
    }

    public static void main(String[] args) {
        ArrayList<Thread> threads = new ArrayList<>();

         for (int i = 0; i < Runtime.getRuntime().availableProcessors(); i++) {
            threads.add(new Thread(new Valinta()));
        }

        for (Thread thread : threads) {
            thread.start();
        }

        try {
            threads.get(0).join();
        } catch (InterruptedException e) {}
    }
}

