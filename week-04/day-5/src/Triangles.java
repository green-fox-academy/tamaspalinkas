import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
    public static void mainDraw(Graphics graphics) {
        int[] xpoints = {0, WIDTH / 2, WIDTH};
        int[] ypoints = {0, (int) Math.floor(HEIGHT * Math.sqrt(3) / 2), 0};
        graphics.drawPolygon(xpoints, ypoints, 3);

        drawTriangle(WIDTH, 6, 0, 0, graphics);


    }

    public static void drawTriangle(int size, int n, int offsetX, int offsetY, Graphics graphics) {
        if (n == 0) {
            return;
        }
        int[] xpoints = {(int) Math.floor(size / 4 + offsetX), (int) Math.floor(size / 2 + offsetX), (int) Math.floor(size / 2 + size / 4 + offsetX)};
        int[] ypoints = {(int) (size * Math.sqrt(3) / 4) + offsetY, offsetY, (int) Math.floor(size * Math.sqrt(3) / 4) + offsetY};
        graphics.drawPolygon(xpoints, ypoints, 3);

        drawTriangle((int) Math.floor(size / 2), n - 1, offsetX, offsetY, graphics);
        drawTriangle((int) Math.floor(size / 2), n - 1, offsetX + size / 2, offsetY, graphics);
        drawTriangle((int) Math.floor(size / 2), n - 1, offsetX + size / 4, offsetY + (int) Math.floor(size * Math.sqrt(3) / 4), graphics);


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