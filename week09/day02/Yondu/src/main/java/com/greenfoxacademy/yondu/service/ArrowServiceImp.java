package com.greenfoxacademy.yondu.service;

import com.greenfoxacademy.yondu.model.Arrow;
import com.greenfoxacademy.yondu.model.ErrorMessage;
import org.springframework.stereotype.Service;

@Service
public class ArrowServiceImp implements ArrowService {

  @Override
  public ErrorMessage getErrorMessage() {
    return new ErrorMessage("Please provide distance and time!");
  }

  @Override
  public Arrow getArrowData(Arrow arrow) {
    return new Arrow(arrow.getDistance(), arrow.getTime(), arrow.getDistance() / arrow.getTime());
  }

}
