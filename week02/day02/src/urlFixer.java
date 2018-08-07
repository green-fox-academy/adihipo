public class urlFixer {
  public static void main(String... args) {
    String url = "https//www.reddit.com/r/nevertellmethebots";
    url = url.replace("bots", "odds");
    url = url.replace("https", "https:");

    System.out.println(url);
  }
}
