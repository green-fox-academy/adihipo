public class Main {
  public static void main(String[] args) {
    Sharpie sharpie1 = new Sharpie();
    sharpie1.color = "blue";
    sharpie1.width = 10;
    sharpie1.use();
    System.out.println(sharpie1.color + "  " + sharpie1.width + "  " + sharpie1.inkAmount);
  }
}
