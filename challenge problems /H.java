import java.util.Scanner;

public class H {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("give me a price in doller and cent format ex 21.71: ");
        double price = scanner.nextDouble();
        int dollars = (int) price;
        int cents = (int) Math.round(price - dollars) * 100;
        System.out.println("you have: " + dollars + "dollars and: " + cents + "cents ");
    }
}
