package main.java.music;

public class BassGuitar extends StringedInstrument {

  public BassGuitar() {
    this.instrument = "Bass Guitar";
    this.numberOfStrings = 4;
  }

  public BassGuitar(int strings) {
    this.instrument = "Bass Guitar";
    this.numberOfStrings = strings;
  }

  @Override
  String sound() {
    return "Duum-duum-duum";
  }
}
