import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {
  public static void mainDraw(Graphics graphics) {
    graphics.setColor(new Color(200, 20, 80, 100));
    graphics.drawLine(WIDTH / 4, HEIGHT / 4, WIDTH / 4, HEIGHT - HEIGHT / 4);

    graphics.setColor(new Color(255, 0, 255, 100));
    graphics.drawLine(WIDTH / 4, HEIGHT - HEIGHT / 4, WIDTH - WIDTH / 4, HEIGHT - HEIGHT / 4);

    graphics.setColor(new Color(80, 0, 80, 100));
    graphics.drawLine(WIDTH - WIDTH / 4, HEIGHT - HEIGHT / 4, WIDTH - WIDTH / 4, HEIGHT / 4);

    graphics.setColor(new Color(160, 0, 160, 100));
    graphics.drawLine(WIDTH - WIDTH / 4, HEIGHT / 4, WIDTH / 4, HEIGHT / 4);
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