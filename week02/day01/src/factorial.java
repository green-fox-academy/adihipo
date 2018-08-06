public class factorial {
  public static void main(String[] args) {
    System.out.println(factorio(5));
  }

  public static int factorio(int number) {
    int fact = 1;
    for (int i = 1; i < number + 1; i++) {
      fact *= i;
    }
    return fact;
  }
}