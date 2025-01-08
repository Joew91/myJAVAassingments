import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class PartA {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("temps.txt"));
        ArrayList<Integer> temps = new ArrayList<>();
        while (in.hasNextInt()) {
            temps.add(in.nextInt());

        }
        in.close();

        int coldest = findColdest(temps);

        for (int temp : temps) {
            System.out.print(temp);
            if (temp == coldest) {
                System.out.println(" <== Lowest");
            } else {
                System.out.println();
            }

        }
    }

    private static int findColdest(ArrayList<Integer> temps) {
        int coldest = temps.get(0);
        for (int temp : temps) {
            if (temp < coldest) {
                coldest = temp;

            }
        }
        return coldest;

    }
}