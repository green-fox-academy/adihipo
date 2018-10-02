package com.greenfoxacademy.groot.model;

import org.springframework.stereotype.Component;

@Component
public class Messages {

  private String received;
  private String translated;

  public Messages(){

  }

  public Messages(String received, String translated) {
    this.received = received;
    this.translated = translated;
  }


  public String getReceived() {
    return received;
  }

  public void setReceived(String received) {
    this.received = received;
  }

  public String getTranslated() {
    return translated;
  }

  public void setTranslated(String translated) {
    this.translated = translated;
  }

}
