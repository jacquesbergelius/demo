public class Point {
    private double x, y, z, t;
    private int echo[] = new int[1000000000];

    Point(int xx, int yy, int zz) {
        x = xx; y = yy; z = zz; t = 0;
    }

    private double sqrt(double a) {
        double x = a/2;                       // Initial quess for the square root
        double eps = 4*Math.ulp(a);           // Check the accuracy of number representation

        while (Math.abs(x*x - a) >= eps) {    // Iterative algorithm until we have enough accuracy
            x = (a/x + x)/2;                  // Improve the estimate x for the square root
        }

        return (x);
    }

    void move(int xx, int yy, int zz) {
        x = xx; y = yy; z = zz;
    }

    double distance(Point p2) {
        return (sqrt((x-p2.x)*(x-p2.x) + (y-p2.y)*(y-p2.y) + (z-p2.z)*(z-p2.z)));
    }
}
