package main.java.music;

public class ElectricGuitar extends StringedInstrument {

  public ElectricGuitar() {
    this.instrument = "Electric Guitar";
    this.numberOfStrings = 6;
  }

  public ElectricGuitar(int strings) {
    this.instrument = "Electric Guitar";
    this.numberOfStrings = strings;
  }

  @Override
  String sound() {
    return "Twang";
  }
}
