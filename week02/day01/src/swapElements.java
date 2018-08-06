public class swapElements {
  public static void main(String[] args) {
    String[] abc = {"First", "Second", "Third"};
    String substitute = abc[0];
    abc[0] = abc[2];
    abc[2] = substitute;
    for (int i = 0; i < abc.length; i++) {
      System.out.println(abc[i]);
    }
  }
}
