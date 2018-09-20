package com.greenfox.tamagochi.Service;

import org.springframework.stereotype.Component;

import java.util.Timer;
import java.util.TimerTask;

@Component
public class TimerService extends TimerTask {

  TimerTask timerTask;
  Timer timer;
  FoxService foxService;

  public TimerService() {
    timerTask = new TimerService();
    timer = new Timer();
    foxService = new FoxService();
    timer.scheduleAtFixedRate(timerTask, 0, 10000);
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
