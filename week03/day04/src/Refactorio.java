public class Refactorio {
  public static void main(String[] args) {
    int n = 4;
    System.out.println(factor(n));
  }

  public static int factor(int n) {
    if (n == 1) {
      return 1;
    } else {
      return n * factor(n - 1);
    }
  }
}
