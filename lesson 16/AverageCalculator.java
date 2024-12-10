public class AverageCalculator {
    public static void main(String[] args) {
        System.out.println("average (10, 8, 10): " + average(10, 8, 10));

        double[] scores = { 100, 90, 80, 100, 80 };
        System.out.println("average of scores array: " + average(scores));

    }

    public static double average(double... values) {
        double sum = 0;
        for (double value : values) {
            sum += value;

        }
        return sum / values.length;
    }

}
