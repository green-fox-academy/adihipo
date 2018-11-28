package com.greenfoxacademy.languagelevels.Controller;

import com.greenfoxacademy.languagelevels.Service.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {

  private RestService restService;

  @Autowired
  public TestRestController(RestService restService) {
    this.restService = restService;
  }


}
