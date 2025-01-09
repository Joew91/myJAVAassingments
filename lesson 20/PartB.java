import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PartB {
    public static void main(String[] args) throws FileNotFoundException {
        File input = new File("inputFiles/characters.txt");
        Scanner in = new Scanner(input).useDelimiter("");
        int digitcount = 0;
        int charcount = 0;

        while (in.hasNext()) {
            char c = in.next().charAt(0);
            System.out.print(c);
            if (Character.isDigit(c)) {
                digitcount++;
            } else if (Character.isLetter(c)) {
                charcount++;
            }
        }
        System.out.println("digits " + digitcount);
        System.out.println("letters " + charcount);
        System.out.println("count " + (digitcount + charcount));
    }
}
