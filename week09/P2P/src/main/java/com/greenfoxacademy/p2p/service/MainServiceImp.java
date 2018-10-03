package com.greenfoxacademy.p2p.service;

import com.greenfoxacademy.p2p.model.User;
import com.greenfoxacademy.p2p.repository.TextRepository;
import com.greenfoxacademy.p2p.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class MainServiceImp implements MainService {

  private UserRepository userRepository;
  private TextRepository textRepository;

  @Autowired
  public MainServiceImp(UserRepository userRepository, TextRepository textRepository) {
    this.userRepository = userRepository;
    this.textRepository = textRepository;
  }

  @Override
  public void createEmptyUser(Model model) {
    model.addAttribute("user", new User());
  }

  @Override
  public boolean isUserNameNull(User user) {
    if (user.getName().isEmpty()) {
      return true;
    }
    return false;
  }

  @Override
  public void saveNameToUser(User user) {
    userRepository.save(user);
  }
}
