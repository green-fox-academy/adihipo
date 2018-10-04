package com.greenfoxacademy.p2p.service;

import com.greenfoxacademy.p2p.model.ErrorMessage;
import com.greenfoxacademy.p2p.model.Text;
import com.greenfoxacademy.p2p.model.User;
import com.greenfoxacademy.p2p.repository.TextRepository;
import com.greenfoxacademy.p2p.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import javax.jws.soap.SOAPBinding;
import java.util.List;


@Service
public class MainServiceImp implements MainService {

  private UserRepository userRepository;
  private TextRepository textRepository;
  private ErrorMessage errorMessage;

  @Autowired
  public MainServiceImp(UserRepository userRepository, TextRepository textRepository, ErrorMessage errorMessage) {
    this.userRepository = userRepository;
    this.textRepository = textRepository;
    this.errorMessage = errorMessage;
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

  @Override
  public void giveTextsToModel(Model model) {
    model.addAttribute("messages", textRepository.findAll());
  }

  @Override
  public void createTextAttachedToUserThenSave(Long id, String text) {
    User user = userRepository.findById(id).orElse(null);
    textRepository.save(new Text(user, text));
  }

  @Override
  public void setErrorMessageToString(String string) {
    errorMessage.setError(string);
  }

  @Override
  public void setErrorMessageToEmpty() {
    errorMessage.setError("");
  }

  @Override
  public void giveErrorMessageToModel(Model model) {
    model.addAttribute("error", errorMessage);
  }

  @Override
  public List<Text> getMessages() {
    return textRepository.findAll();
  }

  @Override
  public List<Text> getMessagesByUserName(String userName) {
    User user = userRepository.findByName(userName);
    return textRepository.findByUser(user);
  }

  @Override
  public boolean isTextIdExist(Long textId) {
    Text text = textRepository.findById(textId).orElse(null);
    return (text != null);
  }

  @Override
  public Text getMessageById(Long textId) {
    return textRepository.findById(textId).orElse(null);
  }

  @Override
  public Text createNewTextByGivenInfoThenReturn(Text text) {
    Text newText;
    User user;
    if (text.getUser().getId() != null) {
      user = userRepository.findById(text.getUser().getId()).orElse(null);
      if (user != null) {
        newText = new Text(user, text.getText());
      } else {
        newText = new Text(text.getUser(), text.getText());
      }
    } else {
      user = userRepository.findByName(text.getUser().getName());
      if (user != null) {
        newText = new Text(user, text.getText());
      } else {
        newText = new Text(text.getUser(), text.getText());
      }
    }
    textRepository.save(newText);
    return newText;
  }

}
