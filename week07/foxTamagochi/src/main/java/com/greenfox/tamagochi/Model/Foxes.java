package com.greenfox.tamagochi.Model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Foxes {

  private List<Fox> foxes;

  public Foxes() {
    foxes = new ArrayList<>();
  }

  public List<Fox> getFoxes() {
    return foxes;
  }

  public void setFoxes(List<Fox> foxes) {
    this.foxes = foxes;
  }

  public void createFoxByNameAndAddToList(String name) {
    Fox fox = new Fox();
    fox.setName(name);
    foxes.add(fox);
  }

  public boolean isThereAFoxInTheListWithThisName(String name) {
    for (int i = 0; i < foxes.size(); i++) {
      if (name.equals(foxes.get(i).getName())) {
        return true;
      }
    }
    return false;
  }

  public Fox giveBackFoxFromListByName(String name) {
    int index = 0;
    for (int i = 0; i < foxes.size(); i++) {
      if (name.equals(foxes.get(i).getName())) {
        index = i;
      }
    }
    return foxes.get(index);
  }

}
