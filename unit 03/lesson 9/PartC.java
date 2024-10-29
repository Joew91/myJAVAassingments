public class PartC {
    public static void main(String[] args) {
        int sum10 = 0;
        for (int i = 0; i < 10; i++) {
            int randomNumber = (int) (Math.random() * 10) + 1;
            sum10 += randomNumber;
            System.out.println("Random Number" + (i + 1) + ": " + randomNumber);
        }
        double average10 = (double) sum10 / 10;
        System.out.println("average of 10 numbers: " + average10);
        int sum1000 = 0;
        for (int i = 0; i < 1000; i++) {
            int randomNumber = (int) (Math.random() * 10) + 1;
            sum1000 += randomNumber;

        }
        double average1000 = (double) sum1000 / 1000;
        System.out.println("Average of 1000 numbers: " + average1000);
        System.out.println("as the number of smaples goes up the averged values should be near 5.5;");
    }
}
