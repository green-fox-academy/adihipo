package com.greenfox.tamagochi.Service;

import java.util.TimerTask;

public class TimingerTask extends TimerTask {

  FoxService foxService;

  public TimingerTask() {
    foxService = new FoxService();
  }


  @Override
  public void run() {
    completeTask();
  }

  public void completeTask() {
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
