import javax.swing.*;
import java.awt.*;

public class GraphicsApp extends JPanel {
    private Image image;

    public GraphicsApp() {
        ImageIcon icon = new ImageIcon("media/spider.jpeg");
        image = icon.getImage();

    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        setBackground(Color.CYAN);
        Graphics2D g2d = (Graphics2D) g;

        int panelHeight = getHeight();
        int panelWidth = getWidth();
        int imgWidth = panelWidth / 4;
        int imgHeight = panelHeight / 4;

        int x = panelWidth - imgWidth;
        int y = panelHeight - imgHeight;

        g2d.drawImage(image, x, y, imgWidth, imgHeight, this);

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("my app");
        GraphicsApp panel = new GraphicsApp();
        frame.add(panel);
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}
