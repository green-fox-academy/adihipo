package com.greenfoxacademy.exercices.controller;

import com.greenfoxacademy.exercices.service.DoublingService;
import com.greenfoxacademy.exercices.service.GreeterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {

  private DoublingService doublingService;
  private GreeterService greeterService;

  @Autowired
  public MainRestController(DoublingService doublingService, GreeterService greeterService) {
    this.doublingService = doublingService;
    this.greeterService = greeterService;
  }


  @GetMapping("/doubling")
  public ResponseEntity<?> doubling(@RequestParam(value = "input", required = false) Long received) {
    if (received == null) {
      return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Error: no number provided. Please...");
    } else {
      doublingService.setReceived(received);
      doublingService.getResult();
      return ResponseEntity.ok(doublingService.getDoubling());
    }
  }

  @GetMapping("/greeter")
  public ResponseEntity<?> greeter(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "title", required = false) String title) {
    if (name == null || title == null) {
      return ResponseEntity.status(HttpStatus.NO_CONTENT).body("Error: information missing.");
    } else {
      greeterService.generateMessage(name, title);
      return ResponseEntity.ok(greeterService.getGreeting());
    }
  }

}
