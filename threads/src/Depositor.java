import java.math.BigInteger;

class Depositor implements Runnable {
    private Account account;
    private int     n;

    public Depositor(Account account, int n) {
        this.account = account;
        this.n       = n;
    }

    public void run() {
        for (int i = 0; i < n; i++) {
            account.deposit(BigInteger.ONE);    // we deposit 1 (unit of money)
            try {
                Thread.sleep(1);                 // wait 1 millisecond
            } catch (InterruptedException e) {
                System.out.println("Depositing interrupted!");
                return;
            }
            }
    }
}