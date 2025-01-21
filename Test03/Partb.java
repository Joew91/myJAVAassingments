import java.util.Scanner;
import java.util.ArrayList;

public class Partb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> scores = new ArrayList<>();

        System.out.println("eneter quiz score or q to quit");
        while (true) {
            System.out.print("enter a score");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("q")) {
                break;
            }
            try {
                double score = Double.parseDouble(input);
                scores.add(score);

            } catch (NumberFormatException e) {
                System.out.println("invalid input. please enter a actual number or if not press q to quit");

            }
        }
        if (scores.isEmpty()) {
            System.out.println("no scores entered.");
        } else {
            double sum = 0;
            for (double score : scores) {
                sum += score;
            }
            double average = sum / scores.size();
            System.out.printf("average score is: %.2f%n", average);
        }
        scanner.close();
    }
}
