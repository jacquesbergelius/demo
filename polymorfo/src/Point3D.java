public class Point3D extends Point {
    private int z;

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    @Override
    protected String location() {
        return super.location() + ", " + z;    // printing as "x, y, z"
    }

    @Override
    public int distanceFromOrigin() {
        // first, we ask the superclass for the distance of the 2Dpoint
        // and then we add the value of z to it
        return (int)Math.round(Math.sqrt(super.distanceFromOrigin()*super.distanceFromOrigin() + z*z));
    }

    int getZ() {
        return  z;
    }

    @Override
    public String toString() {
        return "(" + this.location() + ") distance " + this.distanceFromOrigin();
    }
}