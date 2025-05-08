import javax.swing.*;

public class Application {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Display Interest");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 100);
        frame.setContentPane(new Board());
        frame.setVisible(true);
    }
}
