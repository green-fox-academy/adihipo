package com.greenfoxacademy.yondu.controller;

import com.greenfoxacademy.yondu.service.ArrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ArrowController {

  private ArrowService arrowService;

  @Autowired
  public ArrowController(ArrowService arrowService) {
    this.arrowService = arrowService;
  }

}
