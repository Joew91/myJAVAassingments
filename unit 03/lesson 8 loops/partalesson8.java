import java.util.Scanner;

public class partalesson8 {
    public static void main(String[] args) {
        double cesiumpercent = 100;
        Scanner scan;
        int years = 0;
        double cesium;
        System.out.println("how much spill?");
        scan = new Scanner(System.in);
        cesium = scan.nextDouble();
        while (cesiumpercent > 1.0) {
            cesiumpercent = cesiumpercent / 2;
            years = years + 30;

        }
        if (cesiumpercent < 1.0) {
            System.out.println("this gonna take" + years + "to decay cown" + cesiumpercent + "% left is"
                    + (cesium * cesiumpercent));

        }

    }
}
