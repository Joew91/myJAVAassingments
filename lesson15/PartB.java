import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class PartB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] values = new int [20];
        int currentsize = 0;
        

        while (currentsize < 20 ) {
            System.out.print("enter a integer or q to quit");
            if (input.hasNextInt()) {
                values[currentsize++] = input.nextInt();

                
            } else if (input.hasNext("q") || input.hasNext("Q")) {
                input.next();
                break;

            } else {
                System.out.println("invalid input. enter an intger or q to quit");
                input.next();
            }
            
        }
        for (int i = 0; i < currentsize; i++) {
            System.out.print(values[i]);
            if (i < currentsize - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

System.out.print("enter a target value: ");
int target = input.nextInt();
int count 0;


for (int i = 0; i < currentsize; i++) {
    if (values[i] == target) {
        count++;
    }
}
System.out.println("the value " + target " occurs " + count " times in your orignal data set.");

}

