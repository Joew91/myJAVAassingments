public class SwapExample {
    public static void swap(int a, int b) {
        int tmp;
        tmp = a;
        a = b;
        b = tmp;
    }

    public static void main(String[] args) {
        int x = 1;
        int y = 99;
        System.out.printf("x = %d, y = %d (before)%n", x, y);

        // call the bogus swap function.
        swap(x, y);

        System.out.printf("x = %d, y = %d (after)%n", x, y);
    }
}
