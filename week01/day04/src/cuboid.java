public class cuboid {
  public static void main(String[] args) {

    double a = 20.;
    double b = 30.;
    double c = 25.;

    double surfaceArea = 2*a + 2*b + 2*c;
    double volume = a* b* c;

    System.out.println("Surface area: " + surfaceArea);
    System.out.println("Volume: " + volume);
  }
}