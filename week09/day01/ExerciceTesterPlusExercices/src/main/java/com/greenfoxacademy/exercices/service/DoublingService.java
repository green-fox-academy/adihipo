package com.greenfoxacademy.exercices.service;

import com.greenfoxacademy.exercices.model.Doubling;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoublingService {

  private Doubling doubling;

  @Autowired
  public DoublingService(Doubling doubling) {
    this.doubling = doubling;
  }

  public void setReceived(Long received) {
    doubling.setReceived(received);
  }

  public Long getResult() {
    doubling.setResult(doubling.getReceived() * 2);
    return doubling.getResult();
  }

  public Doubling getDoubling() {
    return doubling;
  }

  public void setDoubling(Doubling doubling) {
    this.doubling = doubling;
  }

}
