import java.util.Scanner;
import java.util.Arrays;

public class QuizScores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] scores = new double[100];
        int count = 0;

        System.out.println("enter quiz scores or q to quit ");
        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) {
                scores[count++] = scanner.nextDouble();

            } else if (scanner.next().equalsIgnoreCase("q")) {
                break;
            } else {
                System.out.println("invalid input, enter a number or q to quit");

            }
        }
        printScores(Arrays.copyOf(scores, count));

        System.out.print("would you like the drop the lowest score(y/n)");
        String response = scanner.next();
        if (response.equalsIgnoreCase("y")) {
            scores = dropLowestScore(scores, count);
            count--;
            System.out.println("lowest score dropped");
            printScores(Arrays.copyOf(scores, count));

        } else {
            System.out.println("no scores were dropped");
        }
        scanner.close();

    }

    public static void printScores(double[] scores) {
        System.out.println("quiz scores: " + Arrays.toString(scores));

    }

    public static double[] dropLowestScore(double[] scores, int size) {
        double min = scores[0];
        int minIndex = 0;

        for (int i = 1; i < size; i++) {
            if (scores[i] < min) {
                min = scores[i];
                minIndex = i;
            }
        }
        double[] newScores = new double[size - 1];
        int newIndex = 0;

        for (int i = 0; i < size - 1; i++) {
            if (i < minIndex) {
                newScores[newIndex] = scores[i];

            } else {
                newScores[newIndex++] = scores[i + 1];
            }
            newIndex++;

        }

        return newScores;

    }

}
