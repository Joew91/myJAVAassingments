import java.util.ArrayList;
import java.util.Scanner;

public class PartA {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        Scanner in = new Scanner(System.in);
        String helper;
        boolean isTakingInput = true;

        do {
            System.out.print("What name would you like to add or 'q' to quit");
            helper = in.next();
            if (helper.equals("q")) {
                isTakingInput = false;
                break;

            } else {
                names.add(helper);

            }

        } while (isTakingInput);
        for (int i = 0; i < names.size(); i++) {
            System.out.print(names.get(i));
        }

    }
}