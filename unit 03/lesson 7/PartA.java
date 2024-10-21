
/*joey wagner 
 * AT java
 */
import java.util.Scanner;

public class PartA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("is today monday (y/n)");
        String reply = in.nextLine();
        boolean isMonday = reply.equals("y");
        System.out.print("enter customers age");
        int age = in.nextInt();
        double discount = 0;
        if (isMonday) {
            if (age < 13) {
                discount = 0.075;
            } else if (age >= 50) {
                discount = 0.15;
            } else {
                discount = 0.05;
            }
        } else {
            if (age < 13) {
                discount = 0.05;

            } else if (age >= 50) {
                discount = 0.075;
            } else {
                discount = 0;
                System.out.println("the customer discount is" + discount);
            }
        }
    }
}
