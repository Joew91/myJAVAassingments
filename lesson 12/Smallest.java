public class Smallest {
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
