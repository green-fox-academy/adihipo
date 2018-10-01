package com.greenfoxacademy.exercices.controller;

import com.greenfoxacademy.exercices.service.DoublingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {

  private DoublingService doublingService;

  @Autowired
  public MainRestController(DoublingService doublingService) {
    this.doublingService = doublingService;
  }


  @GetMapping("/doubling")
  public ResponseEntity<?> doubling(@RequestParam(value = "input", required = false) Long received) {
    if (received == null) {
      return ResponseEntity.status(HttpStatus.NO_CONTENT).body("No number provided. Please...");
    } else {
      doublingService.setReceived(received);
      doublingService.getResult();
      return ResponseEntity.ok(doublingService.getDoubling());
    }
  }

}
