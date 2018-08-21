public class Sponsor extends Person {
  String company;
  int hiredStudents;

  public Sponsor(String name, int age, String gender, String company) {
    super(name, age, gender);
    this.company = company;
    hiredStudents = 0;
  }

  public Sponsor() {
    company = "Google";
    hiredStudents = 0;
  }

  void hire() {
    hiredStudents++;
  }

  void introduce() {
    System.out.println("Hi, I am " + name + " a " + age + " year old " + gender + " who represents " + company + " and hired " + hiredStudents + " students so far.");
  }

  void getGoal() {
    System.out.println("Hire brilliant junior software developers.");
  }
}
