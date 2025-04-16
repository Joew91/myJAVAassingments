import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Board extends JPanel implements ActionListener, KeyListener {
    private Timer timer;
    private Cannon cannon;
    private CannonBall ball;
    private final double G = 1.0;
    private final int GROUND_Y = 500;

    public Board() {
        setFocusable(true);
        setPreferredSize(new Dimension(800, 600));
        addKeyListener(this);
        cannon = new Cannon(200, 500);
        ball = new CannonBall(G, GROUND_Y);
        timer = new Timer(20, this);
        timer.start();
    }

    public void actionPerformed(ActionEvent e) {
        ball.updateBall();
        repaint();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        cannon.draw(g2);
        ball.draw(g2);
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT)
            cannon.decreaseAngle();
        if (e.getKeyCode() == KeyEvent.VK_RIGHT)
            cannon.increaseAngle();
        if (e.getKeyCode() == KeyEvent.VK_SPACE)
            cannon.fire(ball);
        repaint();
    }

    public void keyReleased(KeyEvent e) {
    }

    public void keyTyped(KeyEvent e) {
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Board");
        Board game = new Board();
        frame.add(game);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

class Cannon {
    private int x, y;
    private double angle;
    private final double VELOCITY = 37;
    private final double HYPOT = 100;

    public Cannon(int x, int y) {
        this.x = x;
        this.y = y;
        angle = 45;
    }

    public void increaseAngle() {
        angle = Math.min(angle + 2, 90);
    }

    public void decreaseAngle() {
        angle = Math.max(angle - 2, 0);
    }

    public void fire(CannonBall ball) {
        if (ball.getState() != CannonBall.STATE.IDLE)
            return;
        double rad = Math.toRadians(angle);
        double vx = VELOCITY * Math.cos(rad);
        double vy = -VELOCITY * Math.sin(rad);
        double bx = x + HYPOT * Math.cos(rad);
        double by = y - HYPOT * Math.sin(rad);
        ball.launch(bx, by, vx, vy);
    }

    public void draw(Graphics2D g) {
        double rad = Math.toRadians(angle);
        int x2 = (int) (x + HYPOT * Math.cos(rad));
        int y2 = (int) (y - HYPOT * Math.sin(rad));
        g.setStroke(new BasicStroke(10));
        g.setColor(Color.BLACK);
        g.drawLine(x, y, x2, y2);
    }
}

class CannonBall {
    public enum STATE {
        IDLE, FLYING, EXPLODING
    }

    private double x, y, vx, vy;
    private double ay;
    private double groundY;
    private STATE state;
    private double timeScale = 1.0;

    public CannonBall(double ay, double groundY) {
        this.ay = ay;
        this.groundY = groundY;
        state = STATE.IDLE;
    }

    public void launch(double x, double y, double vx, double vy) {
        this.x = x;
        this.y = y;
        this.vx = vx / timeScale;
        this.vy = vy / timeScale;
        state = STATE.FLYING;
    }

    public void updateBall() {
        if (state == STATE.FLYING) {
            vy += ay / timeScale;
            x += vx;
            y += vy;
            if (y >= groundY) {
                state = STATE.EXPLODING;
                vx = 0;
                vy = 0;
            }
        }
    }

    public void draw(Graphics2D g) {
        if (state == STATE.FLYING) {
            g.setColor(Color.RED);
            g.fillOval((int) x - 5, (int) y - 5, 10, 10);
        } else if (state == STATE.EXPLODING) {
            g.setColor(Color.ORANGE);
            g.fillOval((int) x - 15, (int) y - 15, 30, 30);
        }
    }

    public STATE getState() {
        return state;
    }
}
