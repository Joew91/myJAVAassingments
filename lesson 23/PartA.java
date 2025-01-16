import java.util.Scanner;

public class PartA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            int score = getQuizScore(in);
            System.out.println("valid score entered: " + score);

        } catch (ArithmeticException e) {
            System.out.println("invalid score: " + e.getMessage());

        }
    }

    public static int getQuizScore(Scanner in) {
        System.out.print("enter a quiz score 0-100: ");
        int score = in.nextInt();
        if (score < 0 || score > 100) {
            throw new ArithmeticException(" score must be between0 and 100");

        }
        return score;
    }
}