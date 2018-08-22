public class Student extends Person {

  String previousOrganization;
  int skippedDays;

  public Student(String name, int age, String gender, String previousOrganization) {
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
    skippedDays = 0;
  }

  public Student() {
    previousOrganization = "School of Life";
    skippedDays = 0;
  }

  void skipDays(int numberOfDays) {
    skippedDays += numberOfDays;
  }

  void introduce() {
    System.out.println("Hi, I am " + name + " a " + age + " year old " + gender + " from " + previousOrganization + " who skipped " + skippedDays + " days from the course already.");
  }

  void getGoal() {
    System.out.println("Be a junior software developer.");
  }
}
