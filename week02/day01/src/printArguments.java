import java.util.Scanner;

public class printArguments {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Type how many words you wish to enter");
    int n = scanner.nextInt();
    System.out.println("Now enter things then ENTER " + n + " times");
    String[] stringParams = new String[n];
    for (int i = 0; i < n; i++) {
      Scanner scanner2 = new Scanner(System.in);
      String blabla = scanner2.nextLine();
      stringParams[i] = blabla;
    }
    //String[] stringParams = {"First", "Second", "Third"};
    System.out.println(printParams(stringParams));
  }

  public static String printParams(String[] stringParams) {
    String whole = "";
    for (int i = 0; i < stringParams.length; i++) {
      whole += stringParams[i];
      if (i != stringParams.length - 1) {
        whole += ", ";
      }
    }
    return whole;
  }
}