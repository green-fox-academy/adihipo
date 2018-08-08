import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ToTheCenter {
  public static void mainDraw(Graphics graphics) {
    int x = 0;
    int y = 0;
    for (int i = 0; i < 3; i++) {
      graphics.setColor(new Color(50 + i * 80, i * 10, 50 + i * 80, 255));
      graphics.drawLine(x + i * 100, y, WIDTH / 2, HEIGHT / 2);
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
