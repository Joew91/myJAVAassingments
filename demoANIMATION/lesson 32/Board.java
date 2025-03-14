import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Scanner;

public class Board extends JPanel implements MouseListener, KeyListener {
    private int circleX, circleY;
    private final int CIRCLE_DIAMETER = 20;
    private final int BOARD_WIDTH = 400;
    private final int BOARD_HEIGHT = 400;

    public Board() {
        setPreferredSize(new Dimension(BOARD_WIDTH, BOARD_HEIGHT));
        setBackground(Color.WHITE);
        setFocusable(true);
        addMouseListener(this);
        addKeyListener((java.awt.event.KeyListener) this);
        circleX = (BOARD_WIDTH - CIRCLE_DIAMETER) / 2;
        circleY = (BOARD_HEIGHT - CIRCLE_DIAMETER) / 2;
    }

    public void addNotify() {
        super.addNotify();
        requestFocusInWindow();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.MAGENTA);
        g.fillOval(circleX, circleY, CIRCLE_DIAMETER, CIRCLE_DIAMETER);
    }

    public void mouseClicked(MouseEvent e) {
        circleX = e.getX() - CIRCLE_DIAMETER / 2;
        circleY = e.getY() - CIRCLE_DIAMETER / 2;
        repaint();
        playSound("media/blip.wav");
    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            circleX = (BOARD_WIDTH - CIRCLE_DIAMETER) / 2;
            circleY = (BOARD_HEIGHT - CIRCLE_DIAMETER) / 2;
            repaint();
            playSound("media/blop.wav");
        }
    }

    private void playSound(String soundFile) {
        System.out.println("Playing sound: " + soundFile);
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void keyTyped(KeyEvent e) {
    }

    public void keyReleased(KeyEvent e) {
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("MouseListener and KeyListener ");
        Board board = new Board();
        frame.add(board);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        board.requestFocusInWindow();
        board.requestFocus();
    }
}