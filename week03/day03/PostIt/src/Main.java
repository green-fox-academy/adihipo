public class Main {
  public static void main(String[] args) {
    PostIt one = new PostIt();
    one.backgoroundColor = "orange";
    one.text = "Idea 1";
    one.textColor = "blue";

    PostIt two = new PostIt();
    two.backgoroundColor = "pink";
    two.text = "Awesome";
    two.textColor = "black";

    PostIt three = new PostIt();
    three.backgoroundColor = "yellow";
    three.text = "Superb";
    three.textColor = "green";

    System.out.println(three.backgoroundColor);
  }
}
