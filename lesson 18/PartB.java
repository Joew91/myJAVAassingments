import java.util.ArrayList;
import java.util.Scanner;

public class PartB {

    public static void main(String[] args) {
        ArrayList<Double> scores = new ArrayList<Double>();
        Scanner in = new Scanner(System.in);
        String helper;
        boolean isTakingInput = true;
        do {
            System.out.print("what you like to add or Q to quit");
            helper = in.next();
            if (helper.equals("q") || helper.equals("Q")) {
                isTakingInput = false;
                break;
            } else {
                scores.add(Double.valueOf(helper));

            }
        } while (isTakingInput);
        for (int i = 0; i < scores.size(); i++) {
            System.out.printf("%f.2", scores.get(i));
        }
    }

}
