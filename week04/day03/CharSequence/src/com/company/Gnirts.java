package com.company;

public class Gnirts implements CharSequence {

  String string;

  public Gnirts(String string) {
    this.string = string;
  }

  @Override
  public int length() {
    return this.string.length();
  }

  @Override
  public char charAt(int index) {
    return this.string.charAt(this.length() - 1 - index);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    String subseq = "";
    for (; end >= start; end--) {
      subseq += this.string.charAt(end);
    }
    return subseq;
  }
}
