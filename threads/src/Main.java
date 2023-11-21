public class Main {
    static final int N = 1000;

    public static void main(String[] args) {
        Account account = new Account();

        Thread william = new Thread(new Depositor(account, N));
        Thread jeff    = new Thread(new Depositor(account, N));
        Thread elon    = new Thread(new Depositor(account, N));

        // depositors start their work
        william.start(); jeff.start(); elon.start();

        // here we wait for them to be ready
        try {
            william.join(); jeff.join(); elon.join();
        } catch (InterruptedException e) {
            System.out.println("Depositing interrupted!");
        }

        System.out.println("Saldo is: " + account.getSaldo());  // should be 2000
    }
}