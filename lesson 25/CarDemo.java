class Car {
    private double speed;

    public Car() {
        this.speed = 0.0;
    }

    public Car(double initialSpeed) {
        if (initialSpeed >= 0.0 && initialSpeed <= 120.0) {
            this.speed = initialSpeed;
        } else {
            this.speed = 0.0;

        }
    }

    public double getSpeed() {
        return speed;

    }

    public void acclerate() {
        if (speed < 120.0) {
            speed += 1.0;

        }
    }

    public void brake() {
        if (speed > 0.0) {
            speed -= 0.1;
        }
    }
}

public class CarDemo {
    public static void main(String[] args) {
        Car myCar = new Car();

        System.out.println("Initial speed: " + myCar.getSpeed() + "mph");
        for (int i = 0; i < 5; i++) {
            myCar.acclerate();

        }
        System.out.println("speed after accelerating 5 times" + myCar.getSpeed() + " mph");

        for (int i = 0; i < 3; i++) {
            myCar.brake();
        }
        System.out.println("speed after braking 3 times:" + myCar.getSpeed() + "mph");
    }
}