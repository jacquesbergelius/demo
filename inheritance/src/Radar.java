public class Radar extends Part {
    private float peakPower;

    public Radar(float peakPower, String identifier, String manufacturer, String description, float cost) {
        super(identifier, manufacturer, description, cost);
        this.peakPower = peakPower;
    }

    public float getPeakPower() { return peakPower; }
}