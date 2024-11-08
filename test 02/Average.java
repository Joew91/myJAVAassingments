/* average numbers 1 - 100
 * joey wagner 
 */
public class Average {
    public static void main(String[] args) {
        int sum = 0;
        int count = 100;
        for (int i = 1; i <= 100; i++) {
            sum += i;

        }
        double average = (double) sum / count;
        System.out.println("the average of 1 to 100 is : " + average);
    }
}
