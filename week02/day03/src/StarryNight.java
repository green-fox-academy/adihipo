import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {
  public static void mainDraw(Graphics graphics) {
    int x;
    int y;
    int size;
    int color;

    graphics.setColor(new Color(0, 0, 0, 255));
    graphics.fillRect(0, 0, WIDTH, HEIGHT);

    for (int i = 0; i < 300; i++) {
      x = (int) (Math.random() * 320);
      y = (int) (Math.random() * 343);
      size = (int) (Math.random() * 4);
      color = 120 + (int) (Math.random() * 50);
      night(x, y, size, color, graphics);
    }
  }

  public static void night(int x, int y, int size, int color, Graphics graphics) {
    graphics.setColor(new Color(color, color, color, 255));
    graphics.fillRect(x, y, size, size);
  }

  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 343;

  public static void main(String[] args) {
    JFrame jFrame = new JFrame("Drawing");
    jFrame.setSize(new Dimension(WIDTH, HEIGHT));
    jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    jFrame.add(new ImagePanel());
    jFrame.setLocationRelativeTo(null);
    jFrame.setVisible(true);
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}