public class Plant {
  double waterLevel;
  String color;
  double needsWaterTil;
  double absorb;

  public Plant(String color) {
    this.color = color;
    waterLevel = 0.;
  }

  String whatPlant() {
    if (this instanceof Flower)
      return "Flower";
    if (this instanceof Tree)
      return "Tree";
    return "somethingNew";
  }

  boolean needsWater() {
    return this.waterLevel < this.needsWaterTil;
  }
}
