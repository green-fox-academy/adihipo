public class Bunnies {
  public static void main(String[] args) {
    int nBunnies = 12;
    System.out.println(earCalculator(nBunnies));
  }

  public static int earCalculator(int nBunnies) {
    if (nBunnies == 1) {
      return 2;
    } else {
      return 2 + earCalculator(nBunnies - 1);
    }
  }
}
