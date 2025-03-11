import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.AffineTransform;
import javax.swing.Timer;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class Andy extends JPanel implements ActionListener {
    private Image image;
    private Timer timer;
    private int x, y;
    private int speedX, speedY;
    private double angle = 0;
    private final int PANEL_SIZE = 720;
    private Clip sitarClip, owClip;

    public Andy() {
        image = new ImageIcon("andy.png").getImage();
        x = PANEL_SIZE / 2 - image.getWidth(null) / 2;
        y = PANEL_SIZE / 2 - image.getHeight(null) / 2;
        Random rand = new Random();
        speedX = rand.nextInt(5) + 1;
        speedY = rand.nextInt(5) + 1;

        playSitarMusic();

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

        g2d.drawImage(image, x, y, this);
    }

    public void actionPerformed(ActionEvent e) {
        x += speedX;
        y += speedY;
        angle += 5;

        if (x < 0 || x + image.getWidth(null) >= PANEL_SIZE) {
            speedX = -speedX;
            playOwSound();
        }
        if (y <= 0 || y + image.getWidth(null) >= PANEL_SIZE) {
            speedY = -speedY;
            playOwSound();

        }
        repaint();

    }

    private void playSitarMusic() {
        try {
            File sitarFile = new File("sitar.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(sitarFile);
            sitarClip = AudioSystem.getClip();
            sitarClip.open(audioIn);
            sitarClip.loop(Clip.LOOP_CONTINUOUSLY);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void playOwSound() {
        try {
            File owFile = new File("ow.wav");
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(owFile);
            owClip = AudioSystem.getClip();
            owClip.open(audioIn);
            owClip.start();
        } catch (Exception e) {
            e.printStackTrace();

        }

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Rotating Andy");
        Andy panel = new Andy();
        frame.add(panel);
        frame.setSize(720, 720);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
