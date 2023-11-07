public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int distanceFromOrigin(){
        return (int)Math.round(Math.sqrt(x*x + y*y));
    }

    protected String location() {
        return x + ", " + y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "("+this.location()+") distance "+this.distanceFromOrigin();
    }
}