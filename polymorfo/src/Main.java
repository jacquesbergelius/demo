import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int k = 1;


        List<Point> points = new ArrayList<>();
        points.add(new Point(4, 8));                            // 0
        points.add(new ColouredPoint(1, 1, "green"));     // 1
        points.add(new ColouredPoint(2, 5, "blue"));      // 2
        points.add(new Point3D(5, 2, 8));                    // 3
        points.add(new Point(0, 0));
        points.add(new Point4D(1, 2, 3, 42));
        points.add(new RouguePoint());

        Point4D westPoint = new Point4D(10, 11, 12, 666);
        points.add(westPoint);

        Point4D bestPoint = new Point4D((Point3D) points.get(3), -666);
        points.add(bestPoint);

        for (Object point : points) {
            System.out.println(point.toString());
        }

        //System.out.println(points.get(5).getEinStein());
        if (false) {
            for (Point point : points) {
                System.out.println(point.location());
            }
        }
    }
}