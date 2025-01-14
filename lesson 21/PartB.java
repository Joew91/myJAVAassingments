import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class PartB {
    public static void main(String[] args) throws FileNotFoundException {

        File SalesInput = new File("InputFiles/sales_by_cat.txt");
        Scanner filScanner = new Scanner(SalesInput);

        System.out.printf("%-16s | %-10s | %12s%n", "Deprtment", "Manager", "Revenue", args);
        System.out.println("---------------------------------------------------");

        while (filScanner.hasNextLine()) {
            String line = filScanner.nextLine();
            String[] data = line.split(",");

            String department = data[0].trim();
            String manager = data[1].trim();
            String revenueString = data[2].trim();

            double revenue = 0.0;
            if (!revenueString.equalsIgnoreCase(revenueString)) {
                try {
                    revenue = Double.parseDouble(revenueString);
                } catch (NumberFormatException e) {
                    revenue = 0.0;

                }
            }
            System.out.printf("%-16s | %-10s | $%10.2f%n", department, manager, revenue);
        }
        System.out.println("---------------------------------------------------");

        filScanner.close();
    }
}