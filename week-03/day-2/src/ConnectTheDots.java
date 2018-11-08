import javax.swing.*;

import java.awt.*;
import java.util.Arrays;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {
    public static void mainDraw(Graphics graphics) {
        // Create a function that takes 1 parameter:
        // An array of {x, y} points
        // and connects them with green lines.
        // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
        // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
        // {120, 100}, {85, 130}, {50, 100}}
        int[][] a = {{10, 10}, {290,  10}, {290, 290}, {10, 290}};
        int[][] b = {{10, 10}, {290,  10}, {290, 290}, {10, 290}};
        int[][] c = {{10, 10}, {290,  10}, {290, 290}, {10, 290}};

        //connect(a, graphics);
        int xPoints[] = {24, 145, 25, 145, 25};
        int yPoints[] = {24, 25, 145, 145, 25};
        int nPoints = 5;
        graphics.drawPolygon(xPoints, yPoints, nPoints);

    }
    public static void connect(int[][] arr, Graphics graphics) {

    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

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