import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {
    public static void mainDraw(Graphics graphics) {
        //drawPattern(HEIGHT, WIDTH, 4, 15,graphics);
        //drawPattern(HEIGHT, WIDTH, 8, 15,graphics);
        drawPattern(HEIGHT, WIDTH, 16, 15, graphics);

    }

    public static void drawPattern(int HEIGHT, int WIDTH, int rep, int lines, Graphics graphics) {
        WIDTH /= rep / 2;
        HEIGHT /= rep / 2;
        int posY = 0;
        int posX = 0;


        for (int j = 0; j < rep / 2; j++) {
            for (int k = 0; k < rep / 2; k++) {
                graphics.setColor(Color.MAGENTA);
                for (int i = 0; i < WIDTH; i += WIDTH / lines) {
                    graphics.drawLine(i + posX, posY, WIDTH + posX, i + posY);
                }
                graphics.setColor(Color.GREEN);
                for (int i = 0; i < HEIGHT; i += HEIGHT / lines) {
                    graphics.drawLine(posX, i + posY, i + posX, HEIGHT + posY);
                }
                posX += WIDTH;
            }
            posY += HEIGHT;
            posX = 0;
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