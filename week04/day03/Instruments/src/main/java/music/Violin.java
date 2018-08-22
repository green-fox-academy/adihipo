package main.java.music;

public class Violin extends StringedInstrument {

  public Violin() {
    this.instrument = "Violin";
    this.numberOfStrings = 4;
  }

  public Violin(int strings) {
    this.instrument = "Violin";
    this.numberOfStrings = strings;
  }

  @Override
  String sound() {
    return "Screech";
  }
}
