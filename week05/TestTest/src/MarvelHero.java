public class MarvelHero extends Hero {

  MarvelHero(String name) {
    super(name);
    this.setMotivation(40);
  }

  MarvelHero(String name, double motivation) {
    super(name, motivation);
  }
}
