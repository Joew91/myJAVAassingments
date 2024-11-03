//fixing code  part c joey wagner

import java.util.Scanner;

public class Partc {
    public static void main(String[] args) {
        final double COOKIECOST = 0.99;
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number of cookies: ");
        int num = in.nextInt();
        double cost = num * COOKIECOST;
        double discount = num * COOKIECOST;
        if (num > 24) {
            discount = 0.15;
        } else if (num > 12) {
            discount = 0.05;

        } else if (num > 6) {
            discount = 0.025;
        }
        cost = cost * (1 - discount);
        System.out.printf("for %d cookie the total is $%.2f", num, cost);
        in.close();
    }
}
