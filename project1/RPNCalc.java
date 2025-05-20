import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RPNCalc {
    private JFrame frame;
    private JPanel panel;
    private JTextField txtDisplay;
    private JPanel pnlButtons;
    private GridBagConstraints constraints;
    private Stack stack;
    private boolean clearFlag;

    public RPNCalc() {
        frame = new JFrame("RPN Calculator");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        stack = new Stack();
        panel = new JPanel(new BorderLayout());
        addDisplay(panel);
        addButtons(panel);

        frame.add(panel);
        frame.setVisible(true);
    }

    private void addDisplay(JPanel panel) {
        txtDisplay = new JTextField("0");
        txtDisplay.setHorizontalAlignment(SwingConstants.LEFT);
        txtDisplay.setEditable(false);
        panel.add(txtDisplay, BorderLayout.NORTH);
    }

    private void addButtons(JPanel panel) {
        pnlButtons = new JPanel(new GridBagLayout());
        constraints = new GridBagConstraints();
        constraints.gridheight = 1;
        constraints.gridwidth = 1;
        constraints.weightx = 1.0;
        constraints.weighty = 1.0;
        constraints.fill = GridBagConstraints.BOTH;

        addDigit(0, 0, "7");
        addDigit(1, 0, "8");
        addDigit(2, 0, "9");
        addDigit(0, 1, "4");
        addDigit(1, 1, "5");
        addDigit(2, 1, "6");
        addDigit(0, 2, "1");
        addDigit(1, 2, "2");
        addDigit(2, 2, "3");
        addDigit(1, 3, "0");
        addDigit(2, 3, ".");
        addDigit(0, 3, "+/-");

        addAction(0, 4, "C");
        addAction(1, 4, "CE");
        constraints.gridwidth = 2;
        addAction(2, 4, "ENTER");
        constraints.gridwidth = 1;

        addAction(3, 0, "/");
        addAction(3, 1, "*");
        addAction(3, 2, "-");
        addAction(3, 3, "+");

        panel.add(pnlButtons, BorderLayout.CENTER);
    }

    private JButton addButton(int x, int y, String text) {
        JButton btn = new JButton(text);
        constraints.gridx = x;
        constraints.gridy = y;
        pnlButtons.add(btn, constraints);
        return btn;
    }

    private void addDigit(int x, int y, String text) {
        JButton btn = addButton(x, y, text);
        btn.addActionListener(e -> {
            String current = txtDisplay.getText();
            if (text.equals("+/-")) {
                if (current.startsWith("-")) {
                    txtDisplay.setText(current.substring(1));
                } else if (!current.equals("0")) {
                    txtDisplay.setText("-" + current);
                }
                clearFlag = false;
            } else if (text.equals(".")) {
                if (!current.contains(".")) {
                    txtDisplay.setText(current + ".");
                }
            } else {
                if (clearFlag || current.equals("0")) {
                    current = "";
                    clearFlag = false;
                }
                txtDisplay.setText(current + text);
            }
        });
    }

    private void addAction(int x, int y, String text) {
        JButton btn = addButton(x, y, text);
        btn.addActionListener(e -> {
            try {
                if (text.equals("ENTER")) {
                    double value = Double.parseDouble(txtDisplay.getText());
                    stack.push(value);
                    clearFlag = true;
                } else if (text.equals("C")) {
                    txtDisplay.setText("0");
                    stack.clear();
                    clearFlag = false;
                } else if (text.equals("CE")) {
                    txtDisplay.setText("0");
                    clearFlag = false;
                } else {
                    if (stack.isEmpty())
                        return;
                    double d2 = Double.parseDouble(txtDisplay.getText());
                    double d1 = stack.pop();
                    double result = 0;
                    if (text.equals("+"))
                        result = d1 + d2;
                    if (text.equals("-"))
                        result = d1 - d2;
                    if (text.equals("*"))
                        result = d1 * d2;
                    if (text.equals("/")) {
                        if (d2 == 0) {
                            txtDisplay.setText("Divide by 0");
                            return;
                        }
                        result = d1 / d2;
                    }
                    txtDisplay.setText("" + result);
                    stack.push(result);
                    clearFlag = true;
                }
            } catch (Exception ex) {
                txtDisplay.setText("Error");
            }
        });
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(RPNCalc::new);
    }
}
