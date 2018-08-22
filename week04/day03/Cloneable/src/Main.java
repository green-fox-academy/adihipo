public class Main {
  public static void main(String[] args) {
    Student john = new Student("John Doe", 20, "male", "BME");
    john.introduce();
    Student john2 = john.clone();
    john2.introduce();
  }
}
