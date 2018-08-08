import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class MiddleLine {
  public static void mainDraw(Graphics graphics) {
    graphics.setColor(new Color(255, 255, 10, 10));
    graphics.drawLine(10, 10, 100, 100);

    graphics.setColor(new Color(255, 10, 0, 10));
    graphics.drawLine(0, 0, 200, 50);
    // draw a red horizontal line to the canvas' middle.
    // draw a green vertical line to the canvas' middle.


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