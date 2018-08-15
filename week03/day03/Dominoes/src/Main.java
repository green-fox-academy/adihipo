import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Dominoes> dominoes = initializeDominoes();
    List<Dominoes> dominoesArranged = new ArrayList<>();
    arrangeDominoes(dominoes, dominoesArranged);
    System.out.println(dominoes);
    System.out.println(dominoesArranged);
  }

  static List<Dominoes> initializeDominoes() {
    List<Dominoes> dominoes = new ArrayList<>();
    dominoes.add(new Dominoes(5, 2));
    dominoes.add(new Dominoes(4, 6));
    dominoes.add(new Dominoes(1, 5));
    dominoes.add(new Dominoes(6, 7));
    dominoes.add(new Dominoes(2, 4));
    dominoes.add(new Dominoes(7, 1));
    return dominoes;
  }

  static List<Dominoes> arrangeDominoes(List<Dominoes> dominoes, List<Dominoes> dominoesArranged) {
    dominoesArranged.add(0, dominoes.get(0));
    dominoes.remove(0);
    for (int j = 0; j < dominoesArranged.size(); j++) {
      for (int i = 0; i < dominoes.size(); i++) {
        if (dominoes.get(i).getValues()[0] == dominoesArranged.get(dominoesArranged.size() - 1).getValues()[1]) {
          dominoesArranged.add(dominoesArranged.size(), dominoes.get(i));
          dominoes.remove(i);
          break;
        }
      }
    }
   return dominoesArranged;
  }
}
