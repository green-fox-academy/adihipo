package com.greenfoxacademy.com.piechart.service;

import com.greenfoxacademy.com.piechart.model.ApprenticeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ApprenticeServiceImpl implements ApprenticeService {

  private ApprenticeRepository apprenticeRepository;

  @Autowired
  public ApprenticeServiceImpl(ApprenticeRepository apprenticeRepository) {
    this.apprenticeRepository = apprenticeRepository;
  }
}
