package com.greenfoxacademy.p2p.service;

import com.greenfoxacademy.p2p.repository.TextRepository;
import com.greenfoxacademy.p2p.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainServiceImp implements MainService {

  private UserRepository userRepository;
  private TextRepository textRepository;

  @Autowired
  public MainServiceImp(UserRepository userRepository, TextRepository textRepository) {
    this.userRepository = userRepository;
    this.textRepository = textRepository;
  }

}
