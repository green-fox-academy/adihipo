package main.java.music;

public abstract class StringedInstrument extends Instrument {

  int numberOfStrings;

  @Override
  void play() {
    System.out.println(sound());
  }

  abstract String sound();
}
