public class todoPrint {
  public static void main(String... args) {
    String todoText1 = " - Buy milk\n";
    String todoText0 = "My todo: \n";
    String todoText2 = " - Download games\n    - Diablo";
    todoText0 = todoText0.concat(todoText1);
    todoText0 = todoText0.concat(todoText2);

    System.out.println(todoText0);
  }
}