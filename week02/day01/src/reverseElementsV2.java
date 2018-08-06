public class reverseElementsV2 {
  public static void main(String[] args) {
    int[] aj = {3, 4, 5, 6, 7};
    int[] aj2 = {3, 4, 5, 6, 7};
    for (int i = aj.length - 1; i >= 0; i--) {
      aj[i] = aj2[aj2.length - 1 - i];
    }
    for (int i = 0; i < aj.length; i++) {
      System.out.print(aj[i]);
      System.out.print(" ");
    }
  }
}
