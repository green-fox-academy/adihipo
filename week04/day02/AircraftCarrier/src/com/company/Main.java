public class Main {

  public static void main(String[] args) {
    Aircraft ac1 = new F35();
    Aircraft ac2 = new F16();
    ac1.refill(5);
    ac1.getStatus();
    ac2.refill(100);
    ac2.getStatus();
    System.out.println(ac1.getType());
    System.out.println(ac1.isPriority());
  }
}
