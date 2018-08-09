import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class LinePlayQuarters {
  public static void mainDraw(Graphics graphics) {
    int color1;
    int color2;
    int color3;
    int divider = 2;
    for (int i = 0; i < WIDTH; i += WIDTH / divider) {
      for (int j = 0; j < WIDTH; j += WIDTH / divider) {
        for (int sides = 0; sides < 2; sides++) {
          if (sides == 0) {
            color1 = 200;
            color2 = 0;
            color3 = 255;
          } else {
            color1 = 100;
            color2 = 255;
            color3 = 200;
          }
          for (int x = 0; x <= WIDTH / divider; x += 10) {
            for (int y = 0; y <= WIDTH / divider; y += 10) {
              if (x == y) {
                draw(i, j, sides, x, y, color1, color2, color3, graphics);
              }
            }
          }
        }
      }
    }
  }

  public static void draw(int i, int j, int sides, int x, int y, int color1, int color2, int color3, Graphics graphics) {
    graphics.setColor(new Color(color1, color2, color3, 255));
    if (sides == 0) {
      graphics.drawLine(WIDTH - j - i, x + j, y + i, 0 + i + j);
    } else {
      graphics.drawLine(x + j, WIDTH - j - i, 0 + i + j, y + i);
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