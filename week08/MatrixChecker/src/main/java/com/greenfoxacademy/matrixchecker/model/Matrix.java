package com.greenfoxacademy.matrixchecker.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.text.SimpleDateFormat;
import java.util.Calendar;

@Entity
public class Matrix {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String date;
  private String[] matrix;

  public Matrix() {
  }

  public Matrix(String[] matrix) {
    this.matrix = matrix;
    date = new SimpleDateFormat("yyyy.MM.dd/HH:mm").format(Calendar.getInstance().getTime());
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public String[] getMatrix() {
    return matrix;
  }

  public void setMatrix(String[] matrix) {
    this.matrix = matrix;
  }

}
