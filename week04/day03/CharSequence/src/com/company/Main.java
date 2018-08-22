package com.company;

public class Main {

  public static void main(String[] args) {
    Gnirts g = new Gnirts("example");
    System.out.println(g.length());
    System.out.println(g.charAt(1));
    System.out.println(g.subSequence(1, 4));
    System.out.println(g.chars());
    System.out.println(g.codePoints());

    Shifter s = new Shifter("example", 2);
    System.out.println(s.charAt(0));
// should print out: a
  }
}
