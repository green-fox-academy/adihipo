import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SuperHexagon {
  public static void mainDraw(Graphics graphics) {
    for (int sides = 0; sides <= 2; sides++) {
      for (int x = 0; x <= WIDTH; x += 20) {
        for (int y = 0; y <= WIDTH; y += 20) {
          if (x == y) {
            draw(sides, x, y, graphics);
          }
        }
      }
    }
  }

  public static void draw(int sides, int x, int y, Graphics graphics) {
    graphics.setColor(Color.BLACK);
    if (sides == 0) {
      graphics.drawLine((WIDTH / 2) - 10, WIDTH - 2 * y, (WIDTH / 2) + 10, WIDTH - 2 * y);
      graphics.drawLine((WIDTH / 2) - 20, (WIDTH - 2 * y) - 20, (WIDTH / 2) - 40, (WIDTH - 2 * y) - 20);
      graphics.drawLine((WIDTH / 2) + 20, (WIDTH - 2 * y) - 20, (WIDTH / 2) + 40, (WIDTH - 2 * y) - 20);
      graphics.drawLine((WIDTH / 2) - 50, (WIDTH - 2 * y) - 40, (WIDTH / 2) - 70, (WIDTH - 2 * y) - 40);
      graphics.drawLine((WIDTH / 2) + 50, (WIDTH - 2 * y) - 40, (WIDTH / 2) + 70, (WIDTH - 2 * y) - 40);
    }
    if (sides == 1) {
      graphics.drawLine(WIDTH - (2 * x) + 10, x + 20, WIDTH - 2 * x, x);
    }
    if (sides == 2) {
      graphics.drawLine((WIDTH / 2) - 10, WIDTH - 2 * y, (WIDTH / 2) + 10, WIDTH - 2 * y);
      graphics.drawLine((WIDTH / 2) - 20, (WIDTH - 2 * y) - 20, (WIDTH / 2) - 40, (WIDTH - 2 * y) - 20);
      graphics.drawLine((WIDTH / 2) + 20, (WIDTH - 2 * y) - 20, (WIDTH / 2) + 40, (WIDTH - 2 * y) - 20);
      graphics.drawLine((WIDTH / 2) - 50, (WIDTH - 2 * y) - 40, (WIDTH / 2) - 70, (WIDTH - 2 * y) - 40);
      graphics.drawLine((WIDTH / 2) + 50, (WIDTH - 2 * y) - 40, (WIDTH / 2) + 70, (WIDTH - 2 * y) - 40);
    }

  }

  // Don't touch the code below
  static int WIDTH = 300;
  static int HEIGHT = 300;

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