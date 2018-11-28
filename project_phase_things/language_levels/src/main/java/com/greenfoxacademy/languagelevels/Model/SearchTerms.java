package com.greenfoxacademy.languagelevels.Model;

public class SearchTerms {

  private Language[] languages;

  public SearchTerms() {
  }

  public SearchTerms(Language[] languages) {
    this.languages = languages;
  }

  public Language[] getLanguages() {
    return languages;
  }

  public void setLanguages(Language[] languages) {
    this.languages = languages;
  }
}
