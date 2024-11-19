import javax.swing.*;
import java.awt.*;

public class FourLeavedRose extends JPanel {
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int width = getWidth(); 
        int height = getHeight();
        int centerX = width / 2;
        int centerY = height / 2;
        double scale = 150.0;

        g.setColor(new Color(225, 200, 200));
        g.fillRect(0, 0, width, height);

        g.setColor(Color.BLUE);
        int prevX = centerX, prevY = centerY;

        for (int i = 0; i <= 1000; i++) {
            double theta = 2 * Math.PI * i / 1000;
            double r = Math.cos(2 * theta);

            double x = scale * r * Math.cos(theta);
            double y = scale * r * Math.sin(theta);
            int plotX = (int) (centerX + x);
            int plotY = (int) (centerY - y);
            if (i > 0) {
                g.drawLine(prevX, plotY, plotX plotY);
            }
            prevX = plotX;
            prevY = plotY;
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Four leaved rose");
        FourLeavedRose panel = new FourLeavedRose();
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
