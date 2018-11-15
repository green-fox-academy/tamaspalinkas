import javax.swing.*;

import java.awt.*;


import static java.lang.Math.sin;
import static java.lang.Math.sqrt;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Hexagons {
    public static void mainDraw(Graphics graphics) {
        drawHexagon(WIDTH / 2, HEIGHT / 2, WIDTH / 2, 8, graphics);
        //yPos - (int)(side * sin(Math.PI / 6))
    }

    public static void drawHexagon(int xPos, double yPos, int side, int n, Graphics graphics) {
        if (n == 0) {
            return;
        }
        Polygon h = new Polygon();
        for (int i = 0; i < 6; i++) {
            h.addPoint((int) (xPos + side * Math.cos(i * 2 * Math.PI / 6)),
                    (int) (yPos + side * Math.sin(i * 2 * Math.PI / 6)));
        }
        int[] xpoints = h.xpoints;
        int[] ypoints = h.ypoints;
        graphics.drawPolygon(xpoints, ypoints, 6);
        
        drawHexagon(xPos - side / 2 / 2, yPos - (side / 2.0 * sin(Math.PI / 3)), side / 2, n - 1, graphics);
        drawHexagon(xPos - side / 2 / 2, yPos + (side / 2.0 * sin(Math.PI / 3)), side / 2, n - 1, graphics);
        drawHexagon(xPos + side / 2, yPos, side / 2, n - 1, graphics);

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