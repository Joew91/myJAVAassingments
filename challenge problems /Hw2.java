import java.util.Scanner;

//phone number
public class Hw2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("give me a 10 digit phone number");
        int phoneNumber = scanner.nextInt();
        int areacode = (int) (phoneNumber / 10000000);
        int prefix = (int) (phoneNumber / 10000) % 1000;
        int lineNumber = (int) (phoneNumber % 10000);
        System.out.printf("formatted phone number:", areacode + prefix + lineNumber);

    }
}
