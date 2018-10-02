package com.greenfoxacademy.yondu.service;

import com.greenfoxacademy.yondu.model.Arrow;
import com.greenfoxacademy.yondu.model.ErrorMessage;
import org.springframework.stereotype.Service;

@Service
public interface ArrowService {

  ErrorMessage getErrorMessage();

  Arrow getArrowData(Arrow arrow);

}
