public class PartB {
    public static void main(String[] args) {

        int[][] array1 = {
                { 1, 2, 3, },
                { 4, 5, 6, },
                { 7, 8, 9, }

        };
        int[][] array2 = {
                { 0, 7, 6, 5 },
                { 2, 2, 0, 1 },
                { 8, 4, 5, 7 }

        };
        System.out.println("first array: ");
        print(array1);
        System.out.println("second array: ");
        print(array2);
    }

    public static void print(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
                if (j != array[i].length - 1) {
                    System.out.print(", ");
                }
            }

            System.out.println("");

        }
    }
}
