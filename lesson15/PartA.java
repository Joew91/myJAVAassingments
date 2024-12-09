import java.util.Arrays;
import java.util.Scanner;

public class PartA {

    public static void main(String[] args) {
        Scanner input = new  Scanner(String[] args) {
            int[] values = new int[10];
            int currentsize = 0;

            while (currentsize < 10) {
                System.out.print("enter an integer value or q to quit :")
                if (inputhasNextInt()) {
                    values[currentsize++] = input.nextInt();

                } else if (input.hasNextInt("q") || input.has.Next("Q")) {
                    input.next();
                    break;

                }else {
                    System.out.println("Invalid input");
                    input.next();
                }

             }
             System.out.print("*");
             for (int i = 0; i < currentsize; i++) {
                System.out.print(values[i] + "*");

             }
             System.out.println(null);
             Arrays.sort(values, 0, currentsize)
             for (int i = currentsize - 1; i >= 0; i--) {
                System.out.print(values[i]);
                if (i>0) {
                     System.out.print(",")
                }
             }
             System.out.print();
        }
    }
}