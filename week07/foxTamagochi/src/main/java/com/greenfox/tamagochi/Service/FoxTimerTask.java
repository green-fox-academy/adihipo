package com.greenfox.tamagochi.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Timer;
import java.util.TimerTask;

@Service
public class FoxTimerTask extends TimerTask {

  private FoxService foxService;

  @Autowired
  public FoxTimerTask(FoxService foxService) {
    this.foxService = foxService;
  }

  @Override
  public void run() {
    foxService.lowerLevels();
  }

}
