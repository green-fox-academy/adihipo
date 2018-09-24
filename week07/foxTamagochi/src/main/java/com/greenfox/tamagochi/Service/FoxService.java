package com.greenfox.tamagochi.Service;

import com.greenfox.tamagochi.Model.Fox;
import com.greenfox.tamagochi.Model.Trick;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoxService {

  private List<Fox> foxes;

  public FoxService() {
    foxes = new ArrayList<>();
  }

  public List<Fox> getFoxes() {
    return foxes;
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

  public boolean doesFoxKnowThisTrickByNames(String foxName, String trickName) {
    for (int i = 0; i < giveBackFoxFromListByName(foxName).getTricks().size(); i++) {
      if (giveBackFoxFromListByName(foxName).getTricks().get(i).getName().equals(trickName)) {
        return true;
      }
    }
    return false;
  }

  public void addAFoxATrickByNames(String foxName, String trickName) {
    giveBackFoxFromListByName(foxName).getTricks().add(new Trick(trickName));
  }

  public void setFoxFoodByNames(String foxName, String foodName) {
    giveBackFoxFromListByName(foxName).getFood().setName(foodName);
  }

  public void setFoxDrinkByNames(String foxName, String drinkName) {
    giveBackFoxFromListByName(foxName).getDrink().setName(drinkName);
  }

  public int getFoxAmountOfDrinkByNames(String name) {
    return giveBackFoxFromListByName(name).getDrink().getAmount();
  }

  public int getFoxAmountOfFoodByNames(String name) {
    return giveBackFoxFromListByName(name).getFood().getAmount();
  }

  public void setFoxAmountOfDrinkTo100ByNames(String name) {
    giveBackFoxFromListByName(name).getDrink().setAmount(100);
  }

  public void setFoxAmountOfFoodTo100ByNames(String name) {
    giveBackFoxFromListByName(name).getFood().setAmount(100);
  }

  public void lowerLevels() {
    if (!foxes.isEmpty()) {
      for (int i = 0; i < foxes.size(); i++) {
        if (foxes.get(i).getFood().getAmount() > 0) {
          foxes.get(i).getFood().setAmount(foxes.get(i).getFood().getAmount() - 1);
        }
        if (foxes.get(i).getDrink().getAmount() > 0) {
          foxes.get(i).getDrink().setAmount(foxes.get(i).getDrink().getAmount() - 1);
        }
      }
    }
  }

}
