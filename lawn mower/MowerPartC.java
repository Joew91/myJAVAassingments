import java.util.Random;
import java.util.Scanner;

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

class Mower {
    int row, col, direction;
    Random rand = new Random();

    public Mower(int startRow, int startCol, int starDir) {
        row = startRow;
        col = startCol;
        direction = starDir;
    }

    public void randomizeStart(Yard yard) {
        int height = yard.getHeight() - 2;
        int width = yard.getWidth() - 2;
        int[][] corners = { { 1, 1 }, { 1, width }, { height, 1 }, { height, width } };
        int index = rand.nextInt(4);
        row = corners[index][0];
        col = corners[index][1];
        direction = rand.nextInt(4);
    }

    public boolean updateMower(Yard yard) {
        if (!hasMowableGrass(yard)) {
            return false;
        }
        mow(yard);
        if (canmoveForward(yard)) {
            move();
        } else {
            turnRight();
        }
        return true;
    }

    public boolean hasMowableGrass(Yard yard) {
        for (int r = 1; r < yard.getHeight() - 1; r++) {
            for (int c = 1; c < yard.getWidth() - 1; c++) {
                if (yard.getCell(r, c) == '+') {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean canmoveForward(Yard yard) {
        int nextRow = row, nextCol = col;
        if (direction == 0)
            nextRow--;
        if (direction == 1)
            nextCol++;
        else if (direction == 2)
            nextRow++;
        else
            nextCol--;

        return yard.getCell(nextRow, nextCol) == '+';

    }

    public void move() {
        if (direction == 0)
            row--;

        if (direction == 1)
            col++;
        else if (direction == 2)
            row++;
        else
            col--;

    }

    public void turnRight() {
        direction = (direction + 1) % 4;
    }

    public void mow(Yard yard) {
        yard.setCell(row, col, ' ');
    }

    public static void clearScreen() {
        System.out.println("\033[H\033[2J");
        System.out.flush();
    }

    public static void delay(long ms) {
        try {
            Thread.sleep(ms);

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
