import java.util.Scanner;

public class Partc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double vol;
        double r;
        System.out.println("what is radius of sphere");
        r = in.nextDouble();
        vol = spherize(r);
        System.out.println(vol);

    }

    public static double spherize(double r) {
        double vol;
        vol = (1.33 * Math.PI) * r * r * r;
        return vol;
    }
}
