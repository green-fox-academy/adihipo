package com.greenfoxacademy.p2p.service;

import com.greenfoxacademy.p2p.model.User;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public interface MainService {

  boolean isUnregisteredUser(Long id);

  void createEmptyUser(Model model);

  boolean isUserNameNull(User user);

  boolean isUserAlreadyExist(String name);

  Long getIdByName(String name);

  void saveNameToUser(User user);
}
