import eduni.distributions.Normal;

import java.util.LinkedList;

public class ServicePoint {
    private LinkedList<Customer> queue;

    public ServicePoint() {
        queue = new LinkedList<>();
    }

    public void addToQueue(Customer a) {
        queue.addFirst(a);
    }

    private Customer removeFromQueue() {
        if (queue.size() > 0)
            return queue.removeLast();
        else
            return null;
    }

    public void serve() {
        Customer a;
        Normal normalGenerator = new Normal(5, 1);

        //Clock.getInstance().setClock(Clock.getInstance().getClock() + 5);
        a = removeFromQueue();
        while (a != null) {
            Clock.getInstance().setClock(Clock.getInstance().getClock() + normalGenerator.sample());

            a.setRemovalTime(Clock.getInstance().getClock());
            a.reportResults();

            a = removeFromQueue();
        }
    }
}
