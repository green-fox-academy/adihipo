package com.greenfoxacademy.springstart;

public class GreetingWord {

  private String greeting;
  private int fontSize;
  private int rgbColor1;
  private int rgbColor2;
  private int rgbColor3;
  private String rgbColorAsString;

  public GreetingWord(String greeting) {
    this.greeting = greeting;
    this.fontSize = randomFontSIze();
    this.rgbColor1 = randomRGBColornumber();
    this.rgbColor2 = randomRGBColornumber();
    this.rgbColor3 = randomRGBColornumber();
    this.rgbColorAsString = "rgb(" + rgbColor1 + ", " + rgbColor2 + ", " + rgbColor3 + ")";
  }


  public String getGreeting() {
    return greeting;
  }

  public int getFontSize() {
    return fontSize;
  }

  public int getRgbColor1() {
    return rgbColor1;
  }

  public int getRgbColor2() {
    return rgbColor2;
  }

  public int getRgbColor3() {
    return rgbColor3;
  }

  public String getRgbColorAsString() {
    return rgbColorAsString;
  }

  public int randomRGBColornumber() {
    return (int) (Math.random() * 255);
  }

  public int randomFontSIze() {
    return 10 + (int) (Math.random() * 20);
  }
}
