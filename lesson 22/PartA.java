import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PartA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("enter file name or q to quit: ");
            String filename = input.nextLine();
            if (filename.equals("q")) {
                System.out.println("bye");
                break;

            }
            File file = new File(filename);
            if (file.exists()) {
                try (Scanner fileReader = new Scanner(file)) {
                    while (fileReader.hasNext()) {
                        System.out.println(fileReader.next());

                    }

                } catch (FileNotFoundException E) {
                    System.out.println("error reading this file");
                }
            } else {
                System.out.println("file not found, try again: ");
            }
        }
        input.close();

    }
}