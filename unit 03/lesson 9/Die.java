import java.util.Random;
import java.util.Scanner;

public class Die {

    private int value = 1;
    private Random random = new Random();

    // public methods
    public int getValue() {
        return value;

    }

    public void setValue(int newVal) {
        value = newVal;
    }

    // create public methos to set value to a random interger from 1-6
    public void roll() {
        int r = random.nextInt(1, 7);
        // set value to this this randomly generate interger
        value = r;

    }

    public void display() {
        if (value == 1) {
            System.out.println("+-------+");
            System.out.println("|       |");
            System.out.println("|   x   |");
            System.out.println("|       |");
            System.out.println("+-------+");
        }

        else if (value == 2) {
            System.out.println("+-------+");
            System.out.println("|   x   |");
            System.out.println("|   x   |");
            System.out.println("|       |");
            System.out.println("+-------+");
        }

        else if (value == 3) {
            System.out.println("+-------+");
            System.out.println("|   x   |");
            System.out.println("|   x   |");
            System.out.println("|   x   |");
            System.out.println("+-------+");
        }

        else if (value == 4) {
            System.out.println("+-------+");
            System.out.println("|   x   |");
            System.out.println("|   x   |");
            System.out.println("| x   x |");
            System.out.println("+-------+");

        } else if (value == 5) {
            System.out.println("+-------+");
            System.out.println("|   x   |");
            System.out.println("| x   x |");
            System.out.println("| x   x |");
            System.out.println("+-------+");
        }

        else if (value == 6) {
            System.out.println("+-------+");
            System.out.println("| x   x  |");
            System.out.println("| x   x  |");
            System.out.println("| x   x  |");
            System.out.println("+-------+");
        }
    }

    public static void main(String[] args) {
        Die die = new Die();
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.print("enter command (r/d/q): ");
            String command = in.next();
            if (command.equals("r")) {
                die.roll();
                System.out.println("die was rolled");

            } else if (command.equals("d")) {
                die.display();

            } else if (command.equals("q")) {
                break;

            } else {
                System.out.print("error i dont know what you mean");
            }

        }

    }
}
