package com.greenfoxacademy.yondu.controller;

import com.greenfoxacademy.yondu.model.Arrow;
import com.greenfoxacademy.yondu.service.ArrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArrowController {

  private ArrowService arrowService;

  @Autowired
  public ArrowController(ArrowService arrowService) {
    this.arrowService = arrowService;
  }

  @PostMapping("/")
  public ResponseEntity<?> getSpeed(@RequestBody(required = false) Arrow arrow) {
    if (arrow.getDistance() == null || arrow.getTime() == null) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(arrowService.getErrorMessage());
    } else {
      return ResponseEntity.ok(arrowService.getArrowData(arrow));
    }
  }
}
