public class BunniesAgain {
  public static void main(String[] args) {
    int nBunnies = 12;
    System.out.println(earCalculator(nBunnies));
  }

  public static int earCalculator(int nBunnies) {
    if (nBunnies == 1) {
      return 2;
    } else if (nBunnies % 2 == 0) {
      return 3 + earCalculator(nBunnies - 1);
    } else {
      return 2 + earCalculator(nBunnies - 1);
    }
  }
}
