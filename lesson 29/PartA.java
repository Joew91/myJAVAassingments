import java.util.Scanner;

public class PartA {

    private int speed;
    private final int MAX_SPEED = 30;

    public PartA() {
        this.speed = 0;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int newSpeed) {
        speed = newSpeed;
    }

    public void pedal() {
        speed = Math.min(speed + 1, MAX_SPEED);
    }

    public void brake() {
        speed = Math.max(speed - 1, 0);
    }
}

class GearedBicycle extends PartA {
    public void brake() {
        setSpeed(Math.max(getSpeed() - 2, 0));

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PartA regularBike = new PartA();
        GearedBicycle gearedbike = new GearedBicycle();

        System.out.print("enter initial speed: ");
        int initialSpeed = scanner.nextInt();

        regularBike.setSpeed(initialSpeed);
        gearedbike.setSpeed(initialSpeed);
        System.out.println("Initial speeds: ");
        System.out.println(" Regular Bike: " + regularBike.getSpeed());
        System.out.println(" geared bike: " + gearedbike.getSpeed());

        System.out.print(" enter number of breakes to apply: ");
        int brakeTimes = scanner.nextInt();

        for (int i = 1; i <= brakeTimes; i++) {
            regularBike.brake();
            gearedbike.brake();

            System.out.println("after braking" + i + "timess: ");
            System.out.println(" regular bike:" + regularBike.getSpeed());
            System.out.println(" geared bike: " + gearedbike.getSpeed());

        }
        scanner.close();
    }
}