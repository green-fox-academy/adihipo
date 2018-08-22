package main.java.music;

public abstract class StringedInstrument extends Instrument {

  int numberOfStrings;

  @Override
  public void play() {
    System.out.println(this.instrument + " is a " + this.numberOfStrings + " stringed instrument that goes " + sound() + ".");
  }

  abstract String sound();
}
