package com.greenfoxacademy.languagelevels.Controller;

import com.greenfoxacademy.languagelevels.Model.Apprentice;
import com.greenfoxacademy.languagelevels.Service.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestRestController {

  private RestService restService;

  @Autowired
  public TestRestController(RestService restService) {
    this.restService = restService;
  }


  @GetMapping("/api/showapprentices")
  public List<Apprentice> showApprentices() {
    return restService.getAllFilteredApprentices();
  }
}
