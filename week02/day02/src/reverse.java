public class reverse {
  public static void main(String... args) {
    String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
    char[] reversedCharArray = reversed.toCharArray();

    String reversedBackup = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
    char[] reversedBackupCharArray = reversed.toCharArray();

    for (int i = reversedBackupCharArray.length - 1; i >= 0; i--) {
      reversedCharArray[i] = reversedBackupCharArray[reversedBackupCharArray.length - 1 - i];
    }
    String text = String.valueOf(reversedCharArray);

    System.out.println(text);
  }
}