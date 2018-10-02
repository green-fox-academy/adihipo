package com.greenfoxacademy.groot.controller;

import com.greenfoxacademy.groot.service.GuardianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardianController {

  private GuardianService guardianService;

  @Autowired
  public GuardianController(GuardianService guardianService) {
    this.guardianService = guardianService;
  }
  
//
//  @GetMapping("/groot")
//  public ResponseEntity<?> groot(@RequestParam(value = "message", required = false) String message) {
//    if (message == null) {
//
//    }
//  }

}
