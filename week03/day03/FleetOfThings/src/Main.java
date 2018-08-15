public class Main {

  public static void main(String[] args) {
    Fleet fleet = new Fleet();

    Things first = new Things("Get milk");
    fleet.add(first);

    Things second = new Things("Remove the obstacles");
    fleet.add(second);

    Things third = new Things("Stand up");
    fleet.add(third);
    third.complete();

    Things fourth = new Things("Eat lunch");
    fleet.add(fourth);
    fourth.complete();



    // Create a fleet of things to have this output:
    // 1. [ ] Get milk
    // 2. [ ] Remove the obstacles
    // 3. [x] Stand up
    // 4. [x] Eat lunch

    System.out.println(fleet);
  }
}