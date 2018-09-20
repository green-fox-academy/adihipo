package com.greenfox.tamagochi.Service;

import org.springframework.stereotype.Service;

import java.util.Timer;

@Service
public class Timinger {

  Timer timer;

  public Timinger() {
    timer = new Timer();
    timer.schedule(new TimingerTask(),0, 5000);
  }

}
