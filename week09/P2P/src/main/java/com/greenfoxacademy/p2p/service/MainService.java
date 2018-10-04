package com.greenfoxacademy.p2p.service;

import com.greenfoxacademy.p2p.model.Text;
import com.greenfoxacademy.p2p.model.User;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;

@Service
public interface MainService {

  boolean isUnregisteredUser(Long id);

  void createEmptyUserToModel(Model model);

  boolean isUserNameNull(User user);

  boolean isUserAlreadyExist(String name);

  Long getIdByName(String name);

  void saveNameToUser(User user);

  void giveUserToModelById(Long id, Model model);

  void giveTextsToModel(Model model);

  void createTextAttachedToUserThenSave(Long id, String text);

  void setErrorMessageToString(String string);

  void setErrorMessageToEmpty();

  void giveErrorMessageToModel(Model model);

  List<Text> getMessages();

  List<Text> getMessagesByUserName(String userName);

  boolean isTextIdExist(Long textId);

  Text getMessageById(Long textId);

}
