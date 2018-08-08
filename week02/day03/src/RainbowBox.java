import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBox {
  public static void mainDraw(Graphics graphics) {
    int x;
    int y;
    int size;
    int color1;
    int color2;
    int color3;
    for (int i = 0; i < 100; i++) {
      x = (int) (Math.random() * 300);
      y = (int) (Math.random() * 300);
      size = (int) (Math.random() * 50);
      color1 = 50 + (int) (Math.random() * 205);
      color2 = 50 + (int) (Math.random() * 205);
      color3 = 50 + (int) (Math.random() * 205);
      rainbow(x, y, size, color1, color2, color3, graphics);
    }
  }

  public static void rainbow(int x, int y, int size, int color1, int color2, int color3, Graphics graphics) {
    graphics.setColor(new Color(color1, color2, color3, 255));
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