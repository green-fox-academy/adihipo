public class reverseV2 {
  public static void main(String... args) {
    String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
    String result = "";
    for (int i = reversed.length() - 1; i >= 0; i--) {
      result = result + reversed.charAt(i);
    }
    System.out.println(result);
  }
}