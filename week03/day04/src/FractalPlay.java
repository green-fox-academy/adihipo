import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FractalPlay {
  public static void mainDraw(Graphics graphics) {
    int size = 100;
    int centerX = WIDTH / 2 - size / 2;
    int centerY = HEIGHT / 2 - size / 2;
    fractal(centerX, centerY, size, graphics);
  }

  public static void draw(int x, int y, int size, Graphics graphics) {
    graphics.setColor(new Color(150, 60, 170, 255));
    graphics.fillOval(x, y, size, size);
  }

  public static void fractal(int x, int y, int size, Graphics graphics) {
    draw(x, y, size, graphics);
    if (size > 10) {
      fractal(x - x / 4, y - y / 2, size / 2, graphics);
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