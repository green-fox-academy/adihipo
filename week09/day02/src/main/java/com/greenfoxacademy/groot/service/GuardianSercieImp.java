package com.greenfoxacademy.groot.service;

import com.greenfoxacademy.groot.model.ErrorMessage;
import com.greenfoxacademy.groot.model.Messages;
import org.springframework.stereotype.Service;

@Service
public class GuardianSercieImp implements GuardianService {

  @Override
  public ErrorMessage getErrorMessage() {
    return new ErrorMessage("I am Groot");
  }

  @Override
  public Messages getGrootMessage(String message) {
    return new Messages(message, "I am Groot");
  }
}
