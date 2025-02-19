import java.util.Random;
import java.util.Scanner;
import mow.*;

import mow.Mower;
import mow.Yard;

public class MowerPartC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter lawn height: ");
        int height = scanner.nextInt();
        System.out.print("enter lawn width: ");
        int width = scanner.nextInt();

        Yard yard = new Yard(height, width);
        Mower mower = new Mower(0, 0, 0);
        mower.randomizeStart(yard);

        while (mower.updateMower(yard)) {
            Mower.clearScreen();
            yard.printYard(mower);
            Mower.delay(500);
        }
        System.out.println("lawn mown");
        scanner.close();
    }
}