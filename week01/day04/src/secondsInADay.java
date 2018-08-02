public class secondsInADay {
  public static void main(String[] args) {
    int currentHours = 14;
    int currentMinutes = 34;
    int currentSeconds = 42;

    int allSeconds = 24* 60* 60;
    int timePast = 14* 34* 42;
    int timeLeft = allSeconds - timePast;

    System.out.println("Seconds left from the day: " + timeLeft);
  }
}