package com.greenfoxacademy.com.piechart.model;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class ApprenticeDTOImpl implements ApprenticeDTO{

  @Override
  public List<List<Map<Object, Object>>> getCanvasjsChartData() {
    return CanvasjsChartData.getCanvasjsDataList();
  }
}
