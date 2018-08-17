import javax.swing.*;

import java.awt.*;

import static java.awt.image.ImageObserver.HEIGHT;
import static java.awt.image.ImageObserver.WIDTH;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
  public static void mainDraw(Graphics graphics) {
    int point1x = 100;
    int point1y = 500;
    int point2x = 500;
    int point2y = 500;
    int point3x = 300;
    int point3y = 100;
    fractal(point1x, point1y, point2x, point2y, point3x, point3y, graphics);
  }

  public static void drawTriangle(int point1x, int point1y, int point2x, int point2y, int point3x, int point3y, Graphics graphics) {
    graphics.setColor(new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255), 255));
    graphics.drawLine(point1x, point1y, point2x, point2y);
    graphics.drawLine(point2x, point2y, point3x, point3y);
    graphics.drawLine(point3x, point3y, point1x, point1y);
  }

  public static void fractal(int point1x, int point1y, int point2x, int point2y, int point3x, int point3y, Graphics
          graphics) {
    drawTriangle(point1x, point1y, point2x, point2y, point3x, point3y, graphics);
    if (point2y > 50) {
      fractal(point1x / 2, point1y / 2, point2x / 2, point2y / 2, point3x / 2, point3y / 2, graphics);
    }
  }


  // Don't touch the code below
  static int WIDTH = 600;
  static int HEIGHT = 600;

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