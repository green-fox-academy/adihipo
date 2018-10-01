package com.greenfoxacademy.exercices.service;

import com.greenfoxacademy.exercices.model.WhatArray;
import com.greenfoxacademy.exercices.model.WhatResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WhatService {

  private WhatArray whatArray;
  private WhatResult whatResult;

  @Autowired
  public WhatService(WhatArray whatArray, WhatResult whatResult) {
    this.whatArray = whatArray;
    this.whatResult = whatResult;
  }

  public void doOneThingAccordingToAction(WhatArray whatArray) {
    if (whatArray.getWhat().equals("sum")) {
      sum(whatArray);
    }
    if (whatArray.getWhat().equals("multiply")) {
      multiply(whatArray);
    }
    if (whatArray.getWhat().equals("double")) {
      doubled(whatArray);
    }
  }

  public void sum(WhatArray whatArray) {
    long summa = 0;
    for (int i = 0; i < whatArray.getNumbers().size(); i++) {
      summa += whatArray.getNumbers().get(i);
    }
    whatResult.setResult(summa);
  }

  public void multiply(WhatArray whatArray) {
    long multi = 1;
    for (int i = 0; i < whatArray.getNumbers().size(); i++) {
      multi *= whatArray.getNumbers().get(i);
    }
    whatResult.setResult(multi);
  }

  public void doubled(WhatArray whatArray) {
    for (int i = 0; i < whatArray.getNumbers().size(); i++) {
      whatArray.getNumbers().set(i, whatArray.getNumbers().get(i) * 2);
    }
    whatResult.setResult(whatArray.getNumbers());
  }

  public WhatArray getWhatArray() {
    return whatArray;
  }

  public void setWhatArray(WhatArray whatArray) {
    this.whatArray = whatArray;
  }

  public WhatResult getWhatResult() {
    return whatResult;
  }

  public void setWhatResult(WhatResult whatResult) {
    this.whatResult = whatResult;
  }
}
