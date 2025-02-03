
import java.util.Scanner;

public class Yard {
    private char[][] yard;

    public Yard(int height, int width) {
        yard = new char[height + 2][width + 2];
        for (int i = 0; i < yard.length; i++)
            for (int j = 0; j < yard[i].length; j++) {

                yard[i][j] = (i == 0 || i == yard.length - 1 || j == 0 || j == yard[i].length - 1) ? 'R' : '+';

            }
    }

    public void printYard() {
        for (char[] row : yard) {
            System.out.println(row);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter lawn height: ");
        int height = scanner.nextInt();
        System.out.print("enter lawn width: ");
        int width = scanner.nextInt();
        new Yard(height, width).printYard();
        scanner.close();

    }

}