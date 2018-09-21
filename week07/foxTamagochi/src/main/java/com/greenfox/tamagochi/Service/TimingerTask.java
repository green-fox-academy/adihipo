package com.greenfox.tamagochi.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.TimerTask;

@Service
public class TimingerTask extends TimerTask {

  private FoxService foxService;

  public TimingerTask() {

  }

  @Autowired
  public TimingerTask(FoxService foxService) {
    this.foxService = foxService;
  }


  @Override
  public void run() {
    System.out.println("DONE");
//    foxService.lowerLevels();
  }

}
