package com.greenfoxacademy.exercices.service;

import com.greenfoxacademy.exercices.model.Append;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppendService {

  private Append append;

  @Autowired
  public AppendService(Append append) {
    this.append = append;
  }

  public void setAppended(String forAppend) {
    append.setAppended(forAppend + "a");
  }

  public Append getAppend() {
    return append;
  }

  public void setAppend(Append append) {
    this.append = append;
  }

}
