import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InterestGUI {
    private double balance = 1000.0;

    public static void main(String[] args) {
        new InterestGUI().createUI();
    }

    void createUI() {
        JFrame frame = new JFrame("Display Interest");
        frame.setSize(400, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JTextField rateField = new JTextField("5.0", 10);
        JButton addButton = new JButton("Add Interest");
        JTextArea textArea = new JTextArea(10, 30);
        JScrollPane scrollPane = new JScrollPane(textArea);

        textArea.setEditable(false);
        textArea.append("Balance ($): " + String.format("%.2f", balance) + "\n");

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double rate = Double.parseDouble(rateField.getText());
                    balance = balance + (balance * rate / 100);
                    textArea.append("Balance ($): " + String.format("%.2f", balance) + "\n");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Invalid rate");
                }
            }
        });

        frame.add(new JLabel("Interest Rate:"));
        frame.add(rateField);
        frame.add(addButton);
        frame.add(scrollPane);
        frame.setVisible(true);
    }
}
