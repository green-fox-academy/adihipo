public class summing {
  public static void main(String[] args) {
    System.out.println(sum(7));
  }

  public static int sum(int number) {
    int summ = 0;
    for (int i = 0; i < number + 1; i++) {
      summ += i;
    }
    return summ;
  }
}