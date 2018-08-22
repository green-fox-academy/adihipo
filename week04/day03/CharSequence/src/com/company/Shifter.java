package com.company;

public class Shifter implements CharSequence {

  String string;
  int number;

  public Shifter(String string, int number) {
    this.string = string;
    this.number = number;
  }


  @Override
  public int length() {
    return this.length();
  }

  @Override
  public char charAt(int index) {
    return 0;
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }
}
