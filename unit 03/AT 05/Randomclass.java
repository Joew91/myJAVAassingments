import java.util.Random;

public class Randomclass {
    public static void main(String[] args) {
        Random random = new Random();

        int numberofloops = 10;
        int number = 0;
        for (int i = 0; i < numberofloops; i++) {
            number = random.nextInt(100);
            System.out.println(number);
        }
        ;

    }
}
