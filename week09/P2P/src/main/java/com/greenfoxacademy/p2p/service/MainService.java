package com.greenfoxacademy.p2p.service;

import com.greenfoxacademy.p2p.model.User;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public interface MainService {

  void createEmptyUser(Model model);
  void saveNameToUser(User user);
}
