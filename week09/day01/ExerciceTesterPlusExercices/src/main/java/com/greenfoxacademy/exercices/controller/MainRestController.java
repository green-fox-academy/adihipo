package com.greenfoxacademy.exercices.controller;

import com.greenfoxacademy.exercices.model.Until;
import com.greenfoxacademy.exercices.model.WhatArray;
import com.greenfoxacademy.exercices.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainRestController {

  private ErrorMessageService errorMessageService;
  private DoublingService doublingService;
  private GreeterService greeterService;
  private AppendService appendService;
  private ActionService actionService;
  private WhatService whatService;

  @Autowired
  public MainRestController(ErrorMessageService errorMessageService, DoublingService doublingService, GreeterService greeterService, AppendService appendService, ActionService actionService, WhatService whatService) {
    this.errorMessageService = errorMessageService;
    this.doublingService = doublingService;
    this.greeterService = greeterService;
    this.appendService = appendService;
    this.actionService = actionService;
  }


  @GetMapping("/doubling")
  public Object doubling(@RequestParam(value = "input", required = false) Long received) {
    if (received == null) {
      errorMessageService.setMessage("Please provide an input!");
      return errorMessageService.getErrorMessage();
    } else {
      doublingService.setReceived(received);
      doublingService.getResult();
      return doublingService.getDoubling();
    }
  }

  @GetMapping("/greeter")
  public Object greeter(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "title", required = false) String title) {
    if (name == null) {
      errorMessageService.setMessage("Please provide a name!");
      return errorMessageService.getErrorMessage();
    } else if (title == null) {
      errorMessageService.setMessage("Please provide a title!");
      return errorMessageService.getErrorMessage();
    } else {
      greeterService.generateMessage(name, title);
      return greeterService.getGreeting();
    }
  }

  @GetMapping("/appenda/{appendable}")
  public ResponseEntity<?> appenda(@PathVariable(value = "appendable", required = false) String append) {
    if (append == null) {
      return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Error: information missing.");
    } else {
      appendService.setAppended(append);
      return ResponseEntity.ok(appendService.getAppend());
    }
  }

  @PostMapping("/dountil/{action}")
  public Object action(@PathVariable(value = "action", required = false) String action, @RequestBody(required = false) Until until) {
    if (action == null) {
      errorMessageService.setMessage("Please provide an action!");
      return errorMessageService.getErrorMessage();
    } else if (until.getUntil() == null) {
      errorMessageService.setMessage("Please provide a number!");
      return errorMessageService.getErrorMessage();
    } else {
      actionService.doOneActionAccordingToAction(action, until);
      return actionService.getResult();
    }
  }

  @PostMapping("/arrays")
  public Object arraysAndWhats(@RequestBody(required = false) WhatArray whatArray) {
    if (whatArray == null) {
      errorMessageService.setMessage("Please provide what to do with the numbers!");
      return errorMessageService.getErrorMessage();
    } else {
      //Nullpointer ex. needs fixing
      whatService.doOneThingAccordingToAction(whatArray);
      return whatService.getWhatResult();
    }
  }

}
