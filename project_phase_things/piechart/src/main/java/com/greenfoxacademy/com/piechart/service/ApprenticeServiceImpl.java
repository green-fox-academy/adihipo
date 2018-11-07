package com.greenfoxacademy.com.piechart.service;

import com.greenfoxacademy.com.piechart.model.ApprenticeDTO;
import com.greenfoxacademy.com.piechart.model.ApprenticeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ApprenticeServiceImpl implements ApprenticeService {

  private ApprenticeRepository apprenticeRepository;
  private ApprenticeDTO apprenticeDTO;

  @Autowired
  public ApprenticeServiceImpl(ApprenticeRepository apprenticeRepository, ApprenticeDTO apprenticeDTO) {
    this.apprenticeRepository = apprenticeRepository;
    this.apprenticeDTO = apprenticeDTO;
  }

  @Override
  public List<List<Map<Object, Object>>> getCanvasjsChartData() {
    return apprenticeDTO.getCanvasjsChartData();
  }
}
