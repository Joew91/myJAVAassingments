import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;

public class PartB {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("quizzes.txt"));

        PrintWriter out = new PrintWriter(new File("quizzesMod.txt"));

        double sum = 0;
        int count = 0;
        while (in.hasNextDouble()) {
            double quizScore = in.nextDouble();
            sum += quizScore;
            out.printf("quiz %03d: %6.2f%n", count, quizScore);
            count++;

        }
        double average = sum / count;
        System.out.println("----------");
        System.out.printf("average:     %6.2f%n", average);
        in.close();
        out.close();

    }
}
