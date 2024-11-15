
public class PointTest {
        public static void main(String[] args) {
            Point p1 = new Point();
            System.out.println("point p1 (default): x =" + p1.getX() + ", y =" + p1.getY());
            System.out.println("radius (r) = " + p1.getR() + ", Angle (0) = " + p1.getAngle());

            point p2 = new Point(3, 4);
            System.out.println("\nPoint p2: x =" + p2.getX() + ", y =" + p2.getY());
            System.out.println("radius (r) = " + p2.getR() + ", Angle (0) =" + p2.getAngle());

            p2.translate(1, 1);
            System.out.println("\nAfter translating p2 by (1,1): x = " + p2.getX() + ", y = " + p2.getY());

            Point p3 = new Point(6, 8);
            System.out.println("\nDistance from p2 to p3: " + p2.distanceTo(p3));

        }
    }

