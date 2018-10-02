package com.greenfoxacademy.groot.service;

import com.greenfoxacademy.groot.model.ErrorMessage;
import com.greenfoxacademy.groot.model.Messages;
import org.springframework.stereotype.Service;

@Service
public interface GuardianService {

  ErrorMessage getErrorMessage();

  Messages getGrootMessage(String message);

}
