import java.util.ArrayList;
import java.util.List;

public class Cohort {
  String name;
  List<Student> students;
  List<Mentor> mentors;

  public Cohort(String name) {
    this.name = name;
    students = new ArrayList<Student>();
    mentors = new ArrayList<Mentor>();
  }

  void addStudent() {

  }

  void addMentor() {

  }

  void info() {
    System.out.println("The " + name + " cohort has " + students.size() + " students and " + mentors.size() + " mentors.");
  }
}
