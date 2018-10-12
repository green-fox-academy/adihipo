package com.greenfoxacademy.auth.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

  @GetMapping("/test/user")
  @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
  public String userAccess() {
    return "lol";
  }

  @GetMapping("/test/user2")
  @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
  public String user2Access() {
    return "lol2";
  }

  @GetMapping("/test/admin")
  @PreAuthorize("hasRole('ADMIN')")
  public String adminAccess() {
    return "adminLol";
  }
}
