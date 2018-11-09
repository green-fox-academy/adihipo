package com.greenfoxacademy.com.piechart.controller;

import com.greenfoxacademy.com.piechart.service.ApprenticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Controller
public class ApprenticeController {

  private ApprenticeService apprenticeService;

  @Autowired
  public ApprenticeController(ApprenticeService apprenticeService) {
    this.apprenticeService = apprenticeService;
  }

  @GetMapping("/")
  public String showPieChart(Model model){
    List<String> technologies = Arrays.asList("Java", "Javascript", "Fullstack", "Devops", "Test Automation", "Embedded");
    List<Integer> numbers = Arrays.asList(20, 12, 7, 1, 6, 7);
    model.addAttribute("technologies", technologies);
    model.addAttribute("numbers", numbers);
    return "apprentice";
  }

}
