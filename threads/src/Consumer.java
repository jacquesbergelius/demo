public class Consumer extends Thread {
    @Override
    public void run() {
        int i = 0;

        for (i = 0; i < 1000; i++) {
            System.out.println("Consumer " + this.getName() + ": " + i++);
            i++;
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            Consumer consumer = new Consumer();
            consumer.start();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
            consumer.interrupt();
        }
    }
}
