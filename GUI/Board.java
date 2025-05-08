import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Board extends JPanel {
    private JTextField rateField;
    private JButton addButton;
    private JLabel balanceLabel;
    private double balance;

    public Board() {
        balance = 1000.0;
        setLayout(new FlowLayout());

        add(new JLabel("Interest Rate:"));

        rateField = new JTextField("5.0", 10);
        add(rateField);

        addButton = new JButton("Add Interest");
        add(addButton);

        balanceLabel = new JLabel("Balance ($): " + String.format("%.2f", balance));
        add(balanceLabel);

        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double rate = Double.parseDouble(rateField.getText());
                    balance += balance * (rate / 100);
                    balanceLabel.setText("Balance ($): " + String.format("%.2f", balance));
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid number for interest rate.");
                }
            }
        });
    }
}
