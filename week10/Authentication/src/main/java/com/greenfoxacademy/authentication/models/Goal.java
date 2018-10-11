package com.greenfoxacademy.authentication.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Goal {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String text;
  private Integer dreamLevel;
  private Boolean done;

  public Goal() {

  }

  public Goal(String text, Integer dreamLevel, Boolean done) {
    this.text = text;
    this.dreamLevel = dreamLevel;
    this.done = done;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public Integer getDreamLevel() {
    return dreamLevel;
  }

  public void setDreamLevel(Integer dreamLevel) {
    this.dreamLevel = dreamLevel;
  }

  public Boolean getDone() {
    return done;
  }

  public void setDone(Boolean done) {
    this.done = done;
  }

}
