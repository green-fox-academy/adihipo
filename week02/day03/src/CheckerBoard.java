import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CheckerBoard {
  public static void mainDraw(Graphics graphics) {
    int x = 0;
    int y = 0;
    int color;
    for (int i = 1; i <= 8; i++) {
      for (int j = 1; j <= 8; j++) {
        if (i % 2 == 0) {
          if (j % 2 == 0) {
            color = 255;
          } else {
            color = 0;
          }
        } else {
          if (j % 2 == 0) {
            color = 0;
          } else {
            color = 255;
          }
        }
        graphics.setColor(new Color(color, color, color, 255));
        graphics.fillRect(x, y, 50, 50);
        y += 50;
      }
      y = 0;
      x += 50;
    }
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