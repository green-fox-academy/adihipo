import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SuperHexagon {
  public static void mainDraw(Graphics graphics) {
    for (int sides = 0; sides <= 2; sides++) {
      for (int x = 0; x <= WIDTH; x += 20) {
        draw(sides, x, graphics);
      }
    }
  }

  public static void draw(int sides, int x, Graphics graphics) {
    graphics.setColor(Color.BLACK);
    if (sides == 0) {
      graphics.drawLine((WIDTH / 2) - 10, WIDTH - 2 * x, (WIDTH / 2) + 10, WIDTH - 2 * x);
      graphics.drawLine((WIDTH / 2) - 20, (WIDTH - 2 * x) - 20, (WIDTH / 2) - 40, (WIDTH - 2 * x) - 20);
      graphics.drawLine((WIDTH / 2) + 20, (WIDTH - 2 * x) - 20, (WIDTH / 2) + 40, (WIDTH - 2 * x) - 20);
      graphics.drawLine((WIDTH / 2) - 50, (WIDTH - 2 * x) - 40, (WIDTH / 2) - 70, (WIDTH - 2 * x) - 40);
      graphics.drawLine((WIDTH / 2) + 50, (WIDTH - 2 * x) - 40, (WIDTH / 2) + 70, (WIDTH - 2 * x) - 40);
    }
    if (sides == 1) {
      graphics.drawLine(WIDTH - (2 * x) + 10, x + 20, WIDTH - 2 * x, x);
    }
    if (sides == 2) {
      graphics.drawLine(WIDTH - (2 * x) + 10, x + 20, WIDTH - 2 * x, x);
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