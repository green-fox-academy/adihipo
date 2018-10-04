package com.greenfoxacademy.p2p.controller;

import com.greenfoxacademy.p2p.model.Text;
import com.greenfoxacademy.p2p.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

  @GetMapping("/api/messages/username")
  public Text showMessagesNoUserNameProvidedRest() {
    return null;
  }

  @GetMapping("/api/messages/username/{username}")
  public List<Text> showMessagesOfUserRest(@PathVariable(value = "username", required = false) String userName) {
    return mainService.getMessagesByUserName(userName);
  }

  @GetMapping("/api/messages/id")
  public Text showMessagesNoIdProvidedRest() {
    return null;
  }

  @GetMapping("/api/messages/id/{id}")
  public ResponseEntity<?> showMessagesByIdRest(@PathVariable(value = "id") Long textId) {
    if (!mainService.isTextIdExist(textId)) {
      return ResponseEntity.status(HttpStatus.I_AM_A_TEAPOT).body("There is no text by this id.");
    } else {
      return ResponseEntity.ok(mainService.getMessageById(textId));
    }
  }

  @PostMapping("/api/sendmessage")
  public Text sendMessage(@RequestBody Text text) {
    return mainService.createNewTextByGivenInfoThenReturn(text);
  }

}
