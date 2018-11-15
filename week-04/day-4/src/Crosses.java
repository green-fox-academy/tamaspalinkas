import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Crosses {
    public static void mainDraw(Graphics graphics) {
        drawCross(0,0,WIDTH, 7,graphics);

    }
    public static void drawCross(int x, int y, int size, int n, Graphics graphics) {
        if (n == 0) {
            return;
        }

        for (int i = 0; i < 3; i ++) {
            for (int j = 0; j < 3; j++) {
                int offset = size / 3;
                graphics.drawRect(x + i * offset, y + j * offset, offset, offset);
                if ((i + j) % 2 != 0) {
                    drawCross(x + i * offset, y + j * offset, offset, n - 1, graphics);
                }

            }
        }

    }

    // Don't touch the code below
    static int WIDTH = 729;
    static int HEIGHT = 729;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}