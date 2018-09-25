package com.greenfox.tamagochi.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Timer;

@Service
public class FoxTimer {

  Timer timer;
  FoxService foxService;

  @Autowired
  public FoxTimer(FoxService foxService) {
    this.foxService = foxService;
    timer = new Timer();
    timer.schedule(new FoxTimerTask(foxService), 0, 3000);
  }

}
