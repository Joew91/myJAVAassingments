import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PartB {
    public static void main(String[] args) {
        String filename = "people.txt";
        File file = new File(filename);

        if (file.exists()) {
            try (Scanner fileReader = new Scanner(file)) {
                while (fileReader.hasNextLine()) {
                    String line = fileReader.nextLine();
                    String[] fields = line.split("//s+");
                    String name = fields[0];
                    String birthyear = fields[1];

                    try {
                        int year = Integer.parseInt(birthyear);
                        System.out.println(name + " was born in " + year + ".");
                    } catch (NumberFormatException e) {
                        System.out.println("I donnt know what year" + name + "was born");

                    }

                }

            } catch (FileNotFoundException e) {
                System.out.println("error reading the file");
            }
        } else {
            System.out.println("File not found");
        }
    }

}