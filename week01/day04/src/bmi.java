public class bmi {
  public static void main(String[] args) {
    double massInKg = 81.2;
    double heightInM = 1.78;
    double result = massInKg / (heightInM*heightInM);

    System.out.println("BMI is " + result);
  }
}