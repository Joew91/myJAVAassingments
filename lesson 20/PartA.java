import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PartA {
    public static void main(String[] args) throws FileNotFoundException {
        File input = new File("InputFiles/customerdata.txt");
        Scanner inLine = new Scanner(input).useDelimiter("[//s]");
        String line = "";
        int id;
        String name;
        double cash;

        System.out.println("---------------------------------------");
        System.out.println("ID  |    Name     |     Balance \"");
        System.out.println("---------------------------------------");

        while (inLine.hasNext()) {
            line = inLine.nextLine().trim();
            Scanner in = new Scanner(line).useDelimiter("[,]+");
            id = Integer.valueOf(in.next().trim());
            name = in.next().trim();
            cash = Double.valueOf(in.next().trim());
            System.out.printf("%06d | %11s | $%.15.2f \n", id, name, cash);
        }
    }
}