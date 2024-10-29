import java.util.Scanner;

public class PartA {
    public static void main(String[] args) {
        
        int i = 1;
        double score;
        double totalScore = 100;
        Scanner in = new Scanner(System.in);
        do {
            System.out.printf("what are your score for %d test, or press Q to quit the program: ", i ; );
            i++;
            score = in.nextDouble();
            totalScore = totalScore + score / 2;
        }while (true); {
                
            }
        }
}
