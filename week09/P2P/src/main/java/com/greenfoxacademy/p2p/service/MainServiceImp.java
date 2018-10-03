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
  public boolean isUnregisteredUser(Long id) {
    return (userRepository.findById(id).orElse(null) == null);
  }

  @Override
  public void createEmptyUserToModel(Model model) {
    model.addAttribute("user", new User());
  }

  @Override
  public boolean isUserNameNull(User user) {
    return (user.getName().isEmpty());
  }

  @Override
  public boolean isUserAlreadyExist(String name) {
    User user = userRepository.findByName(name);
    return (user != null);
  }

  @Override
  public Long getIdByName(String name) {
    User user = userRepository.findByName(name);
    return user.getId();
  }

  @Override
  public void saveNameToUser(User user) {
    userRepository.save(user);
  }

  @Override
  public void giveUserToModelById(Long id, Model model) {
    model.addAttribute("user", userRepository.findById(id).orElse(null));
  }

}
