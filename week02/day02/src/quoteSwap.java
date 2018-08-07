import java.util.*;

public class quoteSwap {
  public static void main(String... args) {
    List<String> list = new ArrayList<String>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));
    System.out.println(quoteSwapp(list));
  }

  public static String quoteSwapp(List list) {
    int indexDo = list.indexOf("do");
    int indexCannot = list.indexOf("cannot");

    list.set(indexDo, "cannot");
    list.set(indexCannot, "do");
    String lisst = "";
    for (int i = 0; i < list.size(); i++) {
      lisst += list.get(i) + " ";
    }
    return lisst;
  }
}