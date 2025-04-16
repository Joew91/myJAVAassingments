
import java.awt.*;
import javax.swing.ImageIcon;

public class Cannonball {
    public enum STATE {
        IDLE,
        FLYING,
        EXPLODING
    }

    private double x, y;
    private double vx, vy;
    private double ax, ay;
    private double groundY;
    private STATE state;
    private ImageIcon explosionImg;

    public Cannonball(double ax, double ay, double groundY) {
        this.ax = ax;
        this.ay = ay;
        this.groundY = groundY;
        this.state = STATE.IDLE;
        this.explosionImg = new ImageIcon("media/flame1.png");
    }

    public void launch(double startX, double startY, double vx0, double vy0) {
        if (state == STATE.FLYING)
            return;

        this.x = startX;
        this.y = startY;
        this.vx = vx0;
        this.vy = vy0;
        this.state = STATE.FLYING;
    }

    public void update() {
        if (state == STATE.FLYING) {
            vx += ax;
            vy += ay;

            x += vx;
            y += vy;

            if (y >= groundY) {
                y = groundY;
                state = STATE.EXPLODING;
            }
        }
    }

    public void draw(Graphics2D g2) {
        if (state == STATE.FLYING) {
            g2.setColor(Color.RED);
            g2.fillOval((int) x - 5, (int) y - 5, 10, 10);
        } else if (state == STATE.EXPLODING) {
            g2.drawImage(explosionImg.getImage(), (int) x - 15, (int) y - 15, null);
        }
    }

    public STATE getState() {
        return state;
    }

    public void reset() {
        state = STATE.IDLE;
    }
}
