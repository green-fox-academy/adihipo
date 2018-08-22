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
    return this.string.length();
  }

  @Override
  public char charAt(int index) {
    return this.string.charAt(index + this.number);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    String subseq = "";
    for (; end >= start; start++) {
      subseq += this.string.charAt(start + this.number);
    }
    return subseq;
  }
}
