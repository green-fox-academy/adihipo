public class reverseElementsV2 {
  public static void main(String[] args) {
    int[] aj = {3, 4, 5, 6, 7};
    int[] ajSave = {3, 4, 5, 6, 7};
    for (int i = ajSave.length - 1; i >= 0; i--) {
      aj[i] = ajSave[ajSave.length - 1 - i];
    }
    for (int i = 0; i < aj.length; i++) {
      System.out.print(aj[i]);
      System.out.print(" ");
    }
  }
}
