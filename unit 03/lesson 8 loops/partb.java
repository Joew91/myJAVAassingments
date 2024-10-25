import java.util.Scanner;

public class partb {
    public static void main(String[] args) {
        Scanner scan;
        double cash;
        double intrest;
        double intrestadded;
        int years;
        System.out.println("how much money is your bank?? : ");
        scan = new Scanner(System.in);
        cash = scan.nextDouble();
        System.out.println("eneter the ARP aa a percent");
        scan = new Scanner(System.in);
        intrest = scan.nextDouble();
        System.err.println("how long you want me to run this for you? ");
        scan = new Scanner(System.in);
        years = scan.nextInt();

        System.out.printf("| year | int earned $| Balance$ %n)");
        System.out.println("------------------------------------");
        for (int i = 1; i < years + 1; i++) {
            intrestadded = (cash * (intrest / 1000));
            cash = cash + intrestadded;
            System.out.printf("  | %4d  | %27.2f | %25.2f%n", i, intrestadded, cash);
        }

    }
}
