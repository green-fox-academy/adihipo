import java.util.*;

public class candyShop {
  public static void main(String... args) {
    ArrayList<Object> arrayList = new ArrayList<Object>();
    arrayList.add("Cupcake");
    arrayList.add(2);
    arrayList.add("Brownie");
    arrayList.add(false);
    System.out.println(sweets(arrayList));
  }

  public static ArrayList sweets(ArrayList arrayList) {
    arrayList.set(arrayList.indexOf(2), "Croissant");
    arrayList.set(arrayList.indexOf(false), "Ice cream");
    return arrayList;
  }
}