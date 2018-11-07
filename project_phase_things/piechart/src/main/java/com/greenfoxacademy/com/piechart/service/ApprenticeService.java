package com.greenfoxacademy.com.piechart.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface ApprenticeService {
  List<List<Map<Object, Object>>> getCanvasjsChartData();
}
