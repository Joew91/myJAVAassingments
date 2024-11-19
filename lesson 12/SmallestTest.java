public class SmallestTest {
    public static void main(String[] args) {
        double a = 4.5, b = 2.3, c = 7.8;
        System.out.println("the smallest value: " + smallest(a, b, c));

    }

    public static double smallest(double x, double y, double z) {
        if (x <= y && x <= z) {
            return x;

        } else if (y <= x && y <= z) {
            return y;
        } else {
            return z;
        }
    }
}
