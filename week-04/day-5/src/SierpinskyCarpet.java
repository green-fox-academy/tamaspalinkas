import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SierpinskyCarpet {
    public static void mainDraw(Graphics graphics) {
        int size = WIDTH / 3;
        drawCarpet(size, WIDTH / 3, HEIGHT / 3, 6, graphics);
    }

    public static void drawCarpet(int size, int posX, int posY, int n, Graphics graphics) {
        if (n == 0) {
            return;
        }
        graphics.fillRect(posX, posY, size, size);
        drawCarpet(size / 3, posX - size / 3 * 2, posY + size / 3, n - 1, graphics);
        drawCarpet(size / 3, posX + size + size / 3, posY + size / 3, n - 1, graphics);
        drawCarpet(size / 3, posX + size / 3, posY - size / 3 * 2, n - 1, graphics);
        drawCarpet(size / 3, posX + size / 3, posY + size + size / 3, n - 1, graphics);

        drawCarpet(size / 3, posX - 2 * size / 3, posY - 2 * size / 3, n - 1, graphics);
        drawCarpet(size / 3, posX + size + size / 3, posY - 2 * size / 3, n - 1, graphics);
        drawCarpet(size / 3, posX - 2 * size / 3, posY + size + size / 3, n - 1, graphics);
        drawCarpet(size / 3, posX + size + size / 3, posY + size + size / 3, n - 1, graphics);
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