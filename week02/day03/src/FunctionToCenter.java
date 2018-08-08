import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
  public static void mainDraw(Graphics graphics) {
    for (int x = 0; x <= WIDTH; x += 20) {
      if (x == 0 || x == WIDTH) {
        for (int y = 0; y <= HEIGHT; y += 20) {
          center(x, y, graphics);
        }
      }
    }
    for (int y = 0; y <= HEIGHT; y += 20) {
      if (y == 0 || y == HEIGHT) {
        for (int x = 0; x <= WIDTH; x += 20) {
          center(x, y, graphics);
        }
      }
    }
  }

  public static void center(int x, int y, Graphics graphics) {
    graphics.setColor(new Color(200, 0, 250, 255));
    graphics.drawLine(x, y, WIDTH / 2, HEIGHT / 2);
  }

  // Don't touch the code below
  static int WIDTH = 320;
  static int HEIGHT = 340;

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