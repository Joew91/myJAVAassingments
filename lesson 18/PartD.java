import java.util.ArrayList;
import java.util.Scanner;

public class PartD {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter intgers or type q to quit");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("q")) {
                break;
            }
            try {
                int number = Integer.parseInt(input);
                numbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("invalid input enter a integer or q to quit");

            }
        }
        numbers.removeIf(n -> n % 2 != 0);
        System.out.println("\nModified list : ");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}