package com.greenfoxacademy.com.piechart.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Apprentice {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private String cohort;

  public Apprentice(String name, String cohort) {
    this.name = name;
    this.cohort = cohort;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCohort() {
    return cohort;
  }

  public void setCohort(String cohort) {
    this.cohort = cohort;
  }
}
