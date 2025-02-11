public class Mower {
    int row, col, direction = 1;

    public Mower(int startRow, int startCol, int starDir) {
        row = startRow;
        col = startCol;

    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        if (direction >= 0 && direction <= 3) {
            this.direction = direction;
        }
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {

        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setcol(int col) {

        this.col = col;
    }

    public void move() {
        if (direction == 0) {
            row = row - 1;
        } else if (direction == 1) {
            col = col + 1;
        } else if (direction == 2) {
            row = row + 1;
        } else {
            col = col - 1;

        }
    }

    public void turnRight() {
        direction = direction + 1;
        if (direction > 3) {
            direction = 0;
        }
    }

    public void turnLeft() {
        direction = direction - 1;
        if (direction > 0) {
            direction = 3;
        }
    }

    public char getSymbol() {
        if (direction == 0) {
            return '^';

        } else if (direction == 1) {
            return '>';

        } else if (direction == 2) {
            return 'v';
        } else {
            return '<';
        }
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void delay(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            // do nothing.
        }

    }

    public char checkInFront(Yard yard) {
        return yard.getCell(row, col);
    }

    public void mow(Yard yard) {
        // mows underneath the mower
        yard.setCell(row, col, ' ');
    }

    public static void main(String[] args) {
        Yard yard = new Yard(6, 8);

        Mower mower = new Mower(1, 1, 1);

        while (mower.getCol() < yard.getWidth() - 1) {
            clearScreen();
            yard.printYard(mower);
            delay(1000);
            mower.mow(yard);
            mower.move();
        }
    }

}