package com.greenfoxacademy.springstart;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {

  private long id = 0;
  private static AtomicLong incrementID = new AtomicLong(1);
  private String content;


  public Greeting(String content) {
    this.id = incrementID.getAndIncrement();
    this.content = content;
  }

  public long getId() {
    return id;
  }

  public String getContent() {
    return content;
  }
}
