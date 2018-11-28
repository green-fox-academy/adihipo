package com.greenfoxacademy.languagelevels.Model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Apprentice {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String name;
  @ManyToMany
  private List<Language> languages;

  public Apprentice() {
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Language> getLanguages() {
    return languages;
  }

  public void setLanguages(List<Language> languages) {
    this.languages = languages;
  }
}
