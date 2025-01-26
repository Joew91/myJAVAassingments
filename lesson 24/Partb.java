import java.util.Scanner;

public class Partb {
    public static void main(String[] args) {
        Counter cakeCounter = new Counter();
        Counter pieCounter = new Counter();
        Scanner scanner = new Scanner(System.in);
        String input = "";

        System.out.println("enter c for cake p for pie or q to quit ");
        while (true) {
            if (input.equals("q"))
                break;
            if (input.equals("c"))
                cakeCounter.increment();
            if (input.equals("p"))
                pieCounter.increment();

            {

            }
            {

            }
            {

            }
            System.out.println("total votes for cake: " + cakeCounter.getValue());
            System.out.println("total votes for pie: " + pieCounter.getValue());
        }

    }
}

class Counter {
    private int count = 0;

    public void increment() {
        count++;
    }

    public int getValue() {
        return count;
    }
}
