public class SimpleClass {
    private static double sqrt(double a) {
        double x = a/2;                       // Initial quess for the square root
        double eps = 4*Math.ulp(a);           // Check the accuracy of number representation

        while (Math.abs(x*x - a) >= eps) {    // Iterative algorithm until we have enough accuracy
            x = (a/x + x)/2;                  // Improve the estimate x for the square root
        }

        return (x);
    }

    private static double distance(int x1, int y1, int z1, int x2, int y2, int z2) {
        return (sqrt((x1-x2)*(x1-x2) + (y1-y2)*(y1-y2) + (z1-z2)*(z1-z2)));
    }


    public static void main(String[] args) {
        int x, y, z;
        int x2, y2, z2;

        x = 0; y = 0; z = 0;
        x2 = 1; y2 = 2; z2 = 3;

        System.out.println("Etäisyys on " + distance(x, y, z, x2, y2, z2));

        Point piste = new Point(0, 0, 0);
        Point piste2 = new Point(1, 2, 3);
        System.out.println("Etäisyys on " + piste.distance(piste2));
        //piste.x = 10; piste.y = 20; piste.z = 30;
        piste.move(10, 20, 30);
        piste2.move(20, 30, 40);

        Point piste3 = piste;
    }
}
