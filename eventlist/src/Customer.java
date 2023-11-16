public class Customer {
    private double arrivalTime;
    private double removalTime;
    private int id;
    private static int i = 1;

    public Customer() {
        id = i++;

        arrivalTime = Clock.getInstance().getClock();
        System.out.println("New customer #" + id + " arrived at " + arrivalTime);
    }

    public Customer(double arrivalTime) {
        id = i++;

        this.arrivalTime = arrivalTime;
        System.out.println("New customer #" + id + " arrived at " + arrivalTime);
    }

    public double getArrivalTime() {
        return arrivalTime;
    }

    public double getRemovalTime() {
        return removalTime;
    }

    public void setRemovalTime(double removalTime) {
        this.removalTime = removalTime;
    }

    public int getId() {
        return id;
    }

    public void reportResults() {
        System.out.println("Customer #" + id + " arrived: " + arrivalTime);
        System.out.println("Customer #" + id + " removed: " + removalTime);
        System.out.println("Customer #" + id + " stayed:  " + (removalTime-arrivalTime));
    }
}
