public class Point {
    private double x;
    private double y;

    public Point() {
        this(0, 0);

    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getR() {
        return Math.sqrt(x * x + y * y);

    }

    public double getAngle() {
        return Math.atan2(y, x);

    }

    public void translate(double dx, double dy) {
        this.x += dx;
        this.y += dy;

    }

    public double distanceTo(Point other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}

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
