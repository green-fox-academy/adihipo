package com.greenfoxacademy.springstart;

public class Greeting {

  private long id = 0;
  private long incementID = 0;
  private String content;


  public Greeting(String content) {
    incementID++;
    this.id = incementID;
    this.content = content;
  }

  public long getId() {
    return id;
  }

  public String getContent() {
    return content;
  }
}
