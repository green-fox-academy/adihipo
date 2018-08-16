public class SumDigit {
  public static void main(String[] args) {
    int numero = 10005003;
    System.out.println(summaDigitaria(numero));
  }

  public static int summaDigitaria(int numero) {
    if (numero / 10 == 0) {
      return numero;
    } else {
      return (numero % 10 + summaDigitaria(numero / 10));
    }
  }
}
