import java.util.List;

public class Main {

  public int getIndex(int number, List<Integer> list) {
    if (checkList(list) == 0) {
      for (int j = 0; j < list.size(); j++) {
        if (list.get(j) == number) {
          return j;
        }
      }
    }
    return -1;
  }

  public int checkList(List<Integer> list) {
    if (list.size() > 0) {
      return 0;
    }
    return -1;
  }
}
