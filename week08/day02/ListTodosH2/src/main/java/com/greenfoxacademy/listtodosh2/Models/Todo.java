package com.greenfoxacademy.listtodosh2.Models;


public class Todo {

  private Long id;
  private String title;
  private boolean urgent;
  private boolean done;

  public Todo(Long id, String title, boolean urgent, boolean done) {
    this.id = id;
    this.title = title;
    this.urgent = false;
    this.done = false;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public boolean isUrgent() {
    return urgent;
  }

  public void setUrgent(boolean urgent) {
    this.urgent = urgent;
  }

  public boolean isDone() {
    return done;
  }

  public void setDone(boolean done) {
    this.done = done;
  }

}
