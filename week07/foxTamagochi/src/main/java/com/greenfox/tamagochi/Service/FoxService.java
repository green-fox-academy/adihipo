package com.greenfox.tamagochi.Service;

import com.greenfox.tamagochi.Model.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoxService {

  private List<Fox> foxes;

  public FoxService() {
    foxes = new ArrayList<>();
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

  public boolean isFoxBoyByName(String name) {
    if (giveBackFoxFromListByName(name).getGender().equals("male")) {
      return true;
    }
    return false;
  }

}
