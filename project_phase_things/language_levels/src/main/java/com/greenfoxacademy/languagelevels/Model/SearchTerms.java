package com.greenfoxacademy.languagelevels.Model;

public class SearchTerms {

  private String[] languages;

  public SearchTerms() {
  }

  public SearchTerms(String[] languages) {
    this.languages = languages;
  }

  public String[] getLanguages() {
    return languages;
  }

  public void setLanguages(String[] languages) {
    this.languages = languages;
  }
}
