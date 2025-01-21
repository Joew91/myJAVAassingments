import java.util.Scanner;

public class Parta {
    public static void swap(int index1, int index2, int[] array) {
        if (index1 < 0 || index1 >= array.length || index2 < 0 || index2 >= array.length) {
            System.out.println("incorrect, no swap occured");
            return;
        }

        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
        for (int num : array) {
            System.out.print(num + " ");
        }
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = { 0, 1, 7, 3, 4, 5, 6, 2, 8, 9 };

        swap(2, 7, array);
    }
}
