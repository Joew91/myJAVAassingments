import javax.swing.*;
import java.awt.*;

public class SmileyFace {
    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        g.setColor(Color.YELLOW);
        g.fillOval(50, 50, 300, 300);

        g.setColor(Color.BLACK);
        g.fillOval(120, 120, 50, 300);
        g.setColor(Color.BLACK);
        g.fillOval(120, 120, 50, 50);
        g.fillOval(230, 120, 50, 50);
        g.drawArc(120, 200, 160, 100, 0, -180);

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Smiley Face");
        SmileyFace panel = new SmileyFace();
        frame.add(panel);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

}