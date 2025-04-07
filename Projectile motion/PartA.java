
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;

public class PartA extends JFrame {

    public PartA() {
        add(new Board());
        setResizable(false);
        pack();
        setTitle("Projectile Motion Simulation");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        PartA ex = new PartA();
        ex.setVisible(true);
    }
}

class Board extends JPanel implements KeyListener {

    private final int B_WIDTH = 1600;
    private final int B_HEIGHT = 900;
    private final int FLOOR = B_HEIGHT - 25;

    public Board() {
        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));
        setBackground(Color.CYAN);
        setFocusable(true);
        addKeyListener(this);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        g.drawLine(0, FLOOR, B_WIDTH, FLOOR);
        g.setColor(Color.GREEN);
        g.fillRect(0, FLOOR, B_WIDTH, B_HEIGHT - FLOOR);
    }

    public void keyPressed(KeyEvent e) {
        System.out.println("Key pressed: " + e.getKeyCode());
    }

    public void keyReleased(KeyEvent e) {
    }

    public void keyTyped(KeyEvent e) {
    }
}