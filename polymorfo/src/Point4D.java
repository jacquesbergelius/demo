public class Point4D extends Point3D {
    private int t;

    public Point4D(int x, int y, int z, int t) {
        super(x, y, z);
        this.t = t;
    }

    public Point4D(Point3D point, int t) {
        super(point.getX(), point.getY(), point.getZ());
        this.t = t;
    }

    public String getEinsteinName() {
        return ("Albert Einstein");
    }

    @Override
    public String toString() {
        return "(" + super.location() + ") time " + this.t;
    }
}
