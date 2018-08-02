// package com.greenfoxacademy;

public class Test {

  public static void main(String[] args) {
    // write your code here
    //CTRL + ALT + L     automatic indentation correction
    //CMD + OPTIONS + L
    int a = 5;
    double c = 2.3;
    boolean bool1 = false;
    char char1 = 'a';
    float e = 2.5f;
    long f = 7;

    System.out.println("a is " + a);
    System.out.println("c is " + c);
    System.out.println("bool1 is " + bool1);
    System.out.println("char1 is " + char1 + " which makes it " + a);
    System.out.println("float is " + e);
    System.out.println("long is " + f);

    int addition = a + 7;
    System.out.println(addition);

    String helloTeapot = "2 " + 2;
    System.out.println(helloTeapot);

    //BOOLEANS:    && AND, || OR, ! NOT

    double b = a / f;
    System.out.println(b);

    int bigNumber = 80;
    if (bigNumber < 70) {
      System.out.println(true);
    } else {
      System.out.println(false);
    }

    for (int i = 0; i < 10; i++) {
      System.out.println(i);
    }

    int j = 0;
    while (j < 20) {
      System.out.println(j);
      j++;
    }

  }
}
