package mow;

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

    public int getWidth() {
        // returns width of the yard.
        return yard[0].length;
    }

    public int getHeight() {
        return yard.length;
    }

    public char getCell(int row, int col) {
        return yard[row][col];
    }

    public void setCell(int row, int col, char value) {
        yard[row][col] = value;

    }

    public void printYard() {
        for (char[] row : yard) {
            System.out.println(row);
        }
    }

    public void printYard(Mower mower) {
        for (int row = 0; row < yard.length; row++) {
            for (int col = 0; col < yard[0].length; col++) {
                if (mower.getCol() == col & mower.getRow() == row) {
                    System.out.print(mower.getSymbol());
                } else {
                    System.out.print(yard[row][col]);
                }
            }
            System.out.println();
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
