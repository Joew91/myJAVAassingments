import java.util.ArrayList;
import java.util.Scanner;

public class PartC {
    public static void main(String[] args) {
        ArrayList<Integer> tempatures = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter tempatures or type q to quit");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("q")) {
                break;
            }
            try {
                int temp = Integer.parseInt(input);
                tempatures.add(temp);
            } catch (NumberFormatException e) {
                System.out.println("Invlaid input enter an intger or q to quit");

            }
        }
        if (tempatures.isEmpty()) {
            System.out.println("no tempatures were entered");
            return;
        }
        int lowest = Integer.MAX_VALUE;
        for (int temp : tempatures) {
            if (temp < lowest) {
                lowest = temp;
            }
        }
        System.out.println("/nTempatures");
        for (int temp : tempatures) {
            if (temp == lowest) {
                System.out.println(temp + "<= lowest");
            } else {
                System.out.println(temp);
            }
        }
    }
}
