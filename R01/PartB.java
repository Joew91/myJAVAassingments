public class PartB {
    public static void main(String[] args) {
        printTriangle(5);
    }

    public static void printTriangle(int n) {
        printTriangleHelper(1, n);
    }

    private static void printTriangleHelper(int current, int max) {
        if (current > max) {
            return;
        }
        printStars(current);
        System.out.println();
        printTriangleHelper(current + 1, max);
    }

    private static void printStars(int count) {
        if (count == 0) {
            return;
        }
        System.out.print("*");
        printStars(count - 1);
    }
}
