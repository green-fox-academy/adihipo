import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {
  public static void mainDraw(Graphics graphics) {
    for (int sides = 0; sides < 4; sides++) {
      for (int x = 0; x <= WIDTH / 2; x += 5) {
        for (int y = 0; y <= WIDTH / 2; y += 5) {
          if (x == y) {
            draw(sides, x, y, graphics);
          }
        }
      }
    }
  }

  public static void draw(int sides, int x, int y, Graphics graphics) {
    graphics.setColor(new Color(50, 255, 50, 255));
    if (sides == 0) {
      graphics.drawLine(x, WIDTH / 2, WIDTH / 2, (WIDTH / 2) - y);
    }
    if (sides == 1) {
      graphics.drawLine(WIDTH / 2, y, (WIDTH / 2) + x, WIDTH / 2);
    }
    if (sides == 2) {
      graphics.drawLine(x, WIDTH / 2, WIDTH / 2, (WIDTH / 2) + y);
    }
    if (sides == 3) {
      graphics.drawLine((WIDTH / 2) + x, (WIDTH / 2), (WIDTH / 2), WIDTH - y);
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