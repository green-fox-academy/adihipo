package com.greenfox.tamagochi.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.TimerTask;

@Service
public class TimingerTask extends TimerTask {

  FoxService foxService;

  public TimingerTask() {

  }

  @Autowired
  public TimingerTask(FoxService foxService) {
    this.foxService = foxService;
  }


  @Override
  public void run() {
    completeTask();
  }

  public void completeTask() {
    if (foxService.getFoxes().size() != 0) {
      for (int i = 0; i < foxService.getFoxes().size(); i++) {
        if (foxService.getFoxes().get(i).getFood().getAmount() >= 0) {
          foxService.getFoxes().get(i).getFood().setAmount(foxService.getFoxes().get(i).getFood().getAmount() - 1);
        }
        if (foxService.getFoxes().get(i).getDrink().getAmount() >= 0) {
          foxService.getFoxes().get(i).getDrink().setAmount(foxService.getFoxes().get(i).getDrink().getAmount() - 1);
        }
      }
    }
  }
}
