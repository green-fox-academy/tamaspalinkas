import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SquareGrid {
    public static void mainDraw(Graphics graphics) {
        int size = WIDTH / 2;
        drawSquareGrid(size, WIDTH / 2 - size / 2, HEIGHT / 2 - size / 2, 4, graphics);
    }

    public static void drawSquareGrid(int size, int posX, int posY, int n, Graphics graphics) {
        if (n == 0) {
            return;
        }

        graphics.drawRect(posX, posY, size, size);
        drawSquareGrid(size / 2, posX - size / 4, posY - size / 4, n - 1, graphics);
        drawSquareGrid(size / 2, posX + size / 2 + size / 4, posY + size - size / 4, n - 1, graphics);
        drawSquareGrid(size / 2, posX + size / 2 + size / 4, posY - size / 4, n - 1, graphics);
        drawSquareGrid(size / 2, posX - size / 4, posY + size - size / 4, n - 1, graphics);
    }


    // Don't touch the code below
    static int WIDTH = 500;
    static int HEIGHT = 500;

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