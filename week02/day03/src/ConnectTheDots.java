import javax.swing.*;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {
  public static void mainDraw(Graphics graphics) {
    int[] dots = {10, 10, 290, 10, 290, 290, 10, 290, 10, 10};
//    int[] dots = {50, 100, 70, 70, 80, 90, 90, 90, 100, 70, 120, 100, 85, 130, 50, 100};  //Another "riddle" (foxFace)

    connect(dots, graphics);
  }

  public static void connect(int[] dots, Graphics graphics) {
    graphics.setColor(Color.GREEN);
    for (int i = 0; i <= dots.length - 3; i += 2) {
      graphics.drawLine(dots[i], dots[i + 1], dots[i + 2], dots[i + 3]);
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

