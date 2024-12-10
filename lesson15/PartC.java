import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class PartC {
    public static void main(String[] args) {
        int arraySize = 10000;
        int[] values = new int[arraySize];
        Random rand = new Random();

        for (int i = 0; i < arraySize; i++) {
            values[i] = rand.nextInt(arraySize) + 1;
        }
        int target = rand.nextInt(arraySize) + 1;
        long startTime = System.currentTimeMillis();
        int LinearResult = LinearSearch(values, target);
        long endTime = System.currentTimeMillis();
        System.out.println("linear search: found at index" + LinearResult + "in" + (endTime - startTime) + "ms");

        Arrays.sort(values);
        startTime = System.currentTimeMillis();
        int binaryResult = Arrays.binarySearch(values, target);
        endTime = System.currentTimeMillis();
        System.out.println("binary Search: found at index " + binaryResult + "in" + (endTime = startTime) + "ms");

    }

    public static int LinearSearch(int[] array, int tgtVal) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == tgtVal) {
                return i;
            }
        }
        return -1;
    }
}
