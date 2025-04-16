
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.AffineTransform;
import javax.sound.sampled.*;
import java.io.File;

public class PartB extends JFrame {
    public PartB() {
        add(new Board());
        setResizable(false);
        pack();
        setTitle("Projectile Motion Simulation Part B");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new PartB().setVisible(true);
    }
}

class Board extends JPanel implements KeyListener {
    private final int B_WIDTH = 1600;
    private final int B_HEIGHT = 900;
    private final int FLOOR = B_HEIGHT - 25;
    private Cannon cannon;

    public Board() {
        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
        setBackground(Color.CYAN);
        setFocusable(true);
        addKeyListener(this);
        cannon = new Cannon(60, B_HEIGHT - 60);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.drawLine(0, FLOOR, B_WIDTH, FLOOR);
        g.setColor(Color.GREEN);
        g.fillRect(0, FLOOR, B_WIDTH, B_HEIGHT - FLOOR);
        cannon.draw((Graphics2D) g);
    }

    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
            case KeyEvent.VK_LEFT -> cannon.rotateUp();
            case KeyEvent.VK_RIGHT -> cannon.rotateDown();
            case KeyEvent.VK_SPACE -> cannon.fire();
        }
        repaint();
    }

    public void keyReleased(KeyEvent e) {
    }

    public void keyTyped(KeyEvent e) {
    }
}

class Cannon {
    private double x, y, angle;
    private Image image;
    private Clip wheelSound, fireSound;

    public Cannon(double x, double y) {
        this.x = x;
        this.y = y;
        this.angle = Math.toRadians(45);
        image = new ImageIcon("/media/sm_cannon.png").getImage();
        wheelSound = loadSound("/media/wheel.wav");
        fireSound = loadSound("/media/cannon.wav");
    }

    private Clip loadSound(String path) {
        try {
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(new File(path));
            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);
            return clip;
        } catch (Exception e) {
            System.out.println("Failed to load sound: " + path);
            return null;
        }
    }

    public void rotateUp() {
        if (angle < Math.toRadians(90)) {
            angle += Math.toRadians(2);
            play(wheelSound);
        }
    }

    public void rotateDown() {
        if (angle > 0) {
            angle -= Math.toRadians(2);
            play(wheelSound);
        }
    }

    public void fire() {
        play(fireSound);
    }

    private void play(Clip clip) {
        if (clip != null) {
            clip.setFramePosition(0);
            clip.start();
        }
    }

    public void draw(Graphics2D g2d) {
        AffineTransform old = g2d.getTransform();
        g2d.translate(x, y);
        g2d.rotate(-angle);
        g2d.drawImage(image, -image.getWidth(null) / 2, -image.getHeight(null), null);
        g2d.setTransform(old);

        g2d.setColor(Color.BLUE);
        g2d.fillOval((int) x - 5, (int) y - 5, 10, 10);

        Polygon base = new Polygon();
        base.addPoint((int) x - 20, (int) y + 20);
        base.addPoint((int) x + 20, (int) y + 20);
        base.addPoint((int) x, (int) y);
        g2d.setColor(Color.PINK);
        g2d.fillPolygon(base);
        g2d.setColor(Color.BLACK);
        g2d.drawPolygon(base);
    }
}
