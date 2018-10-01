package com.greenfoxacademy.exercices.service;

import com.greenfoxacademy.exercices.model.ErrorMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ErrorMessageService {

  private ErrorMessage errorMessage;

  @Autowired
  public ErrorMessageService(ErrorMessage errorMessage) {
    this.errorMessage = errorMessage;
  }

  public void setMessage(String message) {
    errorMessage.setError(message);
  }

  public ErrorMessage getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(ErrorMessage errorMessage) {
    this.errorMessage = errorMessage;
  }

}
