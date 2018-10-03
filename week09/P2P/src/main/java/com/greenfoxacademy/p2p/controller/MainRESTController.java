package com.greenfoxacademy.p2p.controller;

import com.greenfoxacademy.p2p.model.Text;
import com.greenfoxacademy.p2p.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainRESTController {

  private MainService mainService;

  @Autowired
  public MainRESTController(MainService mainService) {
    this.mainService = mainService;
  }

  @GetMapping("/api/messages")
  public List<Text> showMessagesRest() {
    return mainService.getMessages();
  }

}
