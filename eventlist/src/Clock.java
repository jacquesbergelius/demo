public class Clock {
    private static Clock instance;
    private double clock;

    private Clock() { }

    public static Clock getInstance() {
        if (instance == null)
            instance = new Clock();
        return instance;
    }

    public void setClock(double clock) {
        this.clock = clock;
    }

    public double getClock() {
        return clock;
    }
}
