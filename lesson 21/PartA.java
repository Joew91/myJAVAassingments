import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class PartA {
    public static void main(String[] args) throws FileNotFoundException {
        File unemploymentinput = new File("InputFiles/unemploymentinput.txt");
        Scanner fileScanner = new Scanner(unemploymentinput);

        System.out.println("---------------------------------------------------------------");
        System.out.println("                   Top 5 Unemployment Rates");
        System.out.println("---------------------------------------------------------------");

        while (fileScanner.hasNextLine()) {
            String line = fileScanner.nextLine();
            String[] data = line.split(",");
            String name = data[0].trim();
            double percentage = Double.parseDouble(data[1].trim());
            int rank = Integer.parseInt(data[2].trim());
            String region = data[3].trim();
            System.out.printf("ranked #%2d: %-16s | %6.2f | %-20s%n", rank, name, percentage, region);

        }
        System.out.println("---------------------------------------------------------------");
        fileScanner.close();
    }
}