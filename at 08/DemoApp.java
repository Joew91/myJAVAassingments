import java.util.Scanner;
import org.derryfield.math.Geometry;
public class DemoApp {
    public static void main(String[] args) {
        double radius;
        System.out.println("please input the radius of the sphere");
        radius = in.nextDouble();
        System.out.println("The area of the sphere is" + Geometry.sphereArea(radius));
        System.out.println("the volume of that sphere is" + Geometry.sphereVolume(radius));
    }
}
