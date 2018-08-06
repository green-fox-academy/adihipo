public class printArgumentV2 {
  public static void main(String[] args) {
    printParams("First", "Second");
  }

  public static void printParams(String... stringParams) {
    System.out.println("Number of arguments: " + stringParams.length);
    for (int i = 0; i < stringParams.length; i++) {
      System.out.print(stringParams[i] + " ");
    }
  }
}