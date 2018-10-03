package com.greenfoxacademy.p2p.controller;

import com.greenfoxacademy.p2p.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRESTController {

  private MainService mainService;

  @Autowired
  public MainRESTController(MainService mainService) {
    this.mainService = mainService;
  }

}
