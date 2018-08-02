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
    boolean fb = (f1 > f2);
    System.out.println(fb);

    int g1 = 350;
    int g2 = 200;
    boolean gb = (g2*2 > g1);
    System.out.println(gb);

    int h = 135798745;
    boolean hb = (h % 11 == 0);
    System.out.println(hb);

    int i1 = 10;
    int i2 = 3;
    boolean ib = (i1 > i2*i2 && i1 < i2*i2*i2);
    System.out.println(ib);

    int j = 1521;
    boolean jb = (j % 3 == 0 || j % 5 ==0);
    System.out.println(jb);

    String k = "Apple";
    k= k +" "+ k +" "+ k +" "+ k;
    System.out.println(k);
  }
}