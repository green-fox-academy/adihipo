import java.util.*;

public class isInList {
  public static void main(String... args) {
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));
    System.out.println(checkNums(list));
  }

  public static boolean checkNums(ArrayList list) {
    return list.containsAll(4, 8, 12, 16);
  }
}