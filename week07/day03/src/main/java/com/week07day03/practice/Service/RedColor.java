package com.week07day03.practice.Service;

import org.springframework.stereotype.Service;

@Service
public class RedColor implements MyColor{

  @Override
  public void printColor() {
    System.out.println("REEEEEED");
  }
}
