
/*joey wagner 
 * AT java
 */
import java.util.Scanner;

public class PartB {
    enum CustomerType {
        CHILD, ADULT, SENIOR
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("is today monday (y/n): ");
        String reply = in.nextLine();
        boolean isMonday = reply.equals("y");
        System.out.print("enter customers age: ");
        int age = in.nextInt();
        CustomerType type;
        if (age < 13) {
            type = CustomerType.CHILD;
        } else if (age >= 50) {
            type = CustomerType.SENIOR;
        } else {
            type = CustomerType.ADULT;
        }

        double discount = 0;
        if (isMonday) {
            if (type == CustomerType.CHILD) {
                discount = 0.075;
            } else if (type == CustomerType.SENIOR) {
                discount = 0.15;
            } else {
                discount = 0.05;
            }
        } else {
            if (type == CustomerType.CHILD) {
                discount = 0.05;

            } else if (type == CustomerType.SENIOR) {
                discount = 0.075;
            } else {
                discount = 0;

            }
        }

        System.out.println("the customer discount is " + discount);
    }
}
