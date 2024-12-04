public class ArrayaAvrage {
    public static void main(String[] args) {
        double[] numbers = { 2.2, 1.0, 3.7, 4.1, 88.0 };
        double sum = 0;
        System.out.println("Arrary Elements: ");
        for (double num : numbers) {
            System.out.println(num);
            sum += num;
        }

        double average = sum / numbers.length;
        System.out.println("Avg =" + average);
    }
}
