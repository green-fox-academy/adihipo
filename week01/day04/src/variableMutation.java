public class variableMutation {
  public static void main(String[] args) {
    int a = 3;
    a +=7;
    System.out.println(a);

    int b = 100;
    b -=7;
    System.out.println(b);

    int c = 44;
    c *= 2;
    System.out.println(c);

    int d = 125;
    d /= 5;
    System.out.println(d);

    int e = 8;
    e *= e;
    System.out.println(e);

    int f1 = 123;
    int f2 = 345;
    if (f1 > f2){
      System.out.println("f1 bigger");
    } else {
      System.out.println("f2 bigger");
    };

    int g1 = 350;
    int g2 = 200;
    if (g2*2 > g1){
      System.out.println("double of g2 wins");
    } else {
      System.out.println("g1 wins");
    };

    int h = 135798745;
    if (h % 11 == 0){
      System.out.println("11 divisor");
    } else {
      System.out.println("11 not divisor");
    };

    int i1 = 10;
    int i2 = 3;
    if (i1 > i2*i2 && i1 < i2*i2*i2){
      System.out.println("true");
    } else {
      System.out.println("false");
    };

    int j = 1521;
    if (j % 3 == 0 || j % 5 ==0){
      System.out.println("true");
    } else {
      System.out.println("false");
    };

    String k = "Apple";
    k= k +" "+ k +" "+ k +" "+ k;
    System.out.println(k);
  }
}