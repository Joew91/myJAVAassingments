public class CheckerBoard {
    public class CheckerBoard extends Jpanel {
        private static final int TITLE_SIZE = 100;

        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            for (int row = 0; row < 4; row++) {
                for (int col = 0; col < 4; col++) {
                    if ((row + col) % 2 == 0) {
                        g.setColor(color.RED);
                    } else {
                        g.setColor(Color.BLUE);
                    }
                    g.fillRect(col * TITLE_SIZE, row * TITLE_SIZE, TITLE_SIZE, TITLE_SIZE);

                }
            }
        }

        public static void main(String[] args) {
            JFrame frame = new JFrame("checkerboard");
            CheckerBoard panel = new CheckerBoard();
            frame.add(panel);
            frame.setSize(400, 400);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        }
    }
}
