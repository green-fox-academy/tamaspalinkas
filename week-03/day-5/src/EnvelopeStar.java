import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {
    public static void mainDraw(Graphics graphics){
        WIDTH /= 2;
        HEIGHT /= 2;
        int lines = 10;
        int offsetX = 0;
        graphics.setColor(Color.GREEN);

        for (int i = 0; i < WIDTH; i+= WIDTH / lines) {
            graphics.drawLine(offsetX + i, HEIGHT, WIDTH, HEIGHT - i);
            graphics.drawLine(WIDTH,HEIGHT - i, WIDTH * 2 -  i, HEIGHT);
            graphics.drawLine(offsetX + i, HEIGHT, WIDTH, HEIGHT + i);
            graphics.drawLine(WIDTH, HEIGHT + i, WIDTH * 2 - i,HEIGHT);
        }
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