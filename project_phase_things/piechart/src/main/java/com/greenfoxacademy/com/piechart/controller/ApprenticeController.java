package com.greenfoxacademy.com.piechart.controller;

import com.greenfoxacademy.com.piechart.service.ApprenticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Map;

@Controller
public class ApprenticeController {

  private ApprenticeService apprenticeService;

  @Autowired
  public ApprenticeController(ApprenticeService apprenticeService) {
    this.apprenticeService = apprenticeService;
  }

  @GetMapping("/")
  public String showPieChart(ModelMap modelMap){
    List<List<Map<Object, Object>>> canvasjsDataList = apprenticeService.getCanvasjsChartData();
    modelMap.addAttribute("dataPointsList", canvasjsDataList);
    return "apprentice";
  }
}
