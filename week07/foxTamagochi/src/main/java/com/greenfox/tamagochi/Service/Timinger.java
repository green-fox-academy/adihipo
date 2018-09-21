package com.greenfox.tamagochi.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Timer;

@Service
public class Timinger {

  Timer timer;
  FoxService foxService;

  @Autowired
  public Timinger(FoxService foxService) {
    this.foxService = foxService;
    timer = new Timer();
    timer.schedule(new TimingerTask(foxService), 0, 3000);
  }

}
