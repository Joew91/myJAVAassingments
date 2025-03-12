import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;

import javax.swing.Timer;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class RotatingAndy extends JPanel implements ActionListener {
    private Image image;
    private Timer timer;
    private int x = 0, y = 0;
    private int speedX = 1, speedY = 1;
    private double angle = 0;
    private final int PANEL_SIZE = 720;

    public RotatingAndy() {
        image = new ImageIcon("media/Andy.png").getImage();
        timer = new Timer(25, this);
        timer.start();

    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        setBackground(Color.WHITE);

        Graphics2D g2d = (Graphics2D) g;
        int imgWidth = image.getWidth(this);
        int imgHeight = image.getHeight(this);
        int centerX = x + imgWidth / 2;
        int centerY = y + imgHeight / 2;

        AffineTransform transform = new AffineTransform();
        transform.translate(centerX, centerY);
        transform.rotate(Math.toRadians(angle));
        transform.translate(-imgWidth / 2, -imgHeight / 2);

        g2d.setTransform(transform);

        g2d.drawImage(image, 0, 0, this);
    }

    public void actionPerformed(ActionEvent e) {
        x += speedX;
        y += speedY;
        angle += 5;

        if (x > PANEL_SIZE)
            x = -image.getWidth(this);
        if (y > PANEL_SIZE)
            y = -image.getHeight(this);

        repaint();

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("media/Andy.png");
        RotatingAndy panel = new RotatingAndy();
        frame.add(panel);
        frame.setSize(720, 720);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
