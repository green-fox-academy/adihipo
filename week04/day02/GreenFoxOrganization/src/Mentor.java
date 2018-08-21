public class Mentor extends Person {
  String level;

  public Mentor(String name, int age, String gender, String level) {
    super(name, age, gender);
    this.level = level;
  }

  public Mentor() {
    level = "intermediate";
  }

  void introduce() {
    System.out.println("Hi, I am " + name + " a " + age + " year old " + gender + " " + level + " mentor.");
  }

  void getGoal() {
    System.out.println("Educate brilliant junior software developers.");
  }
}
