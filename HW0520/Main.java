package HW0520;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        double[][] points = {
                {1.0, 2.0},
                {3.0, 4.0},
                {5.0, 1.0},
                {7.0, 2.0}
        };

        Pair closestPair = getClosestPair(points);
        System.out.println("Closest pair: " + closestPair);
        System.out.println("Distance: " + closestPair.getDistance());
        Point point1 = new Point(1, 2);
        Point point2 = new Point(4, 6);

        double distance = Point.distance(point1, point2);
        System.out.println("Distance between " + point1 + " and " + point2 + " is " + distance);
    }

    public static Pair getClosestPair(double[][] points){
        if (points.length < 2) {
            throw new IllegalArgumentException("There must be at least two points");
        }

        Point closestPoint1 = null;
        Point closestPoint2 = null;
        double minDistance = Double.MAX_VALUE;

        for (int i = 0; i < points.length - 1; i++) {
            for (int j = i + 1; j < points.length; j++) {
                Point p1 = new Point((int) points[i][0], (int) points[i][1]);
                Point p2 = new Point((int) points[j][0], (int) points[j][1]);
                Pair pair = new Pair(p1, p2);
                double distance = pair.getDistance();

                if (distance < minDistance) {
                    minDistance = distance;
                    closestPoint1 = p1;
                    closestPoint2 = p2;
                }
            }
        }

        return new Pair(closestPoint1, closestPoint2);
    }
}
