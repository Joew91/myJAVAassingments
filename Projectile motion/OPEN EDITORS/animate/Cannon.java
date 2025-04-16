
public class Cannon {
    private double angle;
    private final int PIVOT_X, PIVOT_Y;
    private final int HYPOT = 100;
    private final double MUZZLE_VELOCITY = 37;

    public Cannon(int x, int y) {
        this.PIVOT_X = x;
        this.PIVOT_Y = y;
        this.angle = 45;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }

    public double getAngle() {
        return angle;
    }

    public void fire(Cannon ball) {
        if (ball.getState() != Cannon.STATE.FLYING) {
            double radians = Math.toRadians(angle);
            double xOffset = HYPOT * Math.cos(radians);
            double yOffset = HYPOT * Math.sin(radians);
            double initX = PIVOT_X + xOffset;
            double initY = PIVOT_Y - yOffset;

            double vx = MUZZLE_VELOCITY * Math.cos(radians);
            double vy = -MUZZLE_VELOCITY * Math.sin(radians);

            ball.launch(initX, initY, vx, vy);
        }
    }
}
