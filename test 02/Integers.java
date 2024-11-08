/*Joseph Wagner  
 *  Test 02 
 * Sorting three integers in reverse order 
 * 
 */

import java.util.Scanner;

public class Integers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("what the first number you wanna give me: ");
        int number1 = scanner.nextInt();
        System.out.print("whats the second number you wanna give me: ");
        int number2 = scanner.nextInt();
        System.out.print("whats the third number you wanna give me: ");
        int number3 = scanner.nextInt();
        if (number1 >= number2 && number1 >= number3) {
            System.out.print(number1 + " ");
            if (number2 >= number3) {
                System.out.print(number2 + " " + number3);
            } else {
                System.out.print(number3 + " " + number2);
            }

        } else if (number2 >= number1 && number2 >= number3) {
            System.out.print(number2 + " ");
            if (number1 >= number3) {
                System.out.print(number1 + " " + number3);

            } else {
                System.out.print(number3 + " " + number1);
            }
        } else {
            System.out.print(number3 + " ");
            if (number1 >= number2) {
                System.out.print(number1 + " " + number2);

            } else {
                System.out.print(number2 + " " + number1);
            }
        }
        scanner.close();
    }
}
