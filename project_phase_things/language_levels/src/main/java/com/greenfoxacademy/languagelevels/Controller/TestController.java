package com.greenfoxacademy.languagelevels.Controller;

import com.greenfoxacademy.languagelevels.Model.SearchTerms;
import com.greenfoxacademy.languagelevels.Service.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class TestController {

  private RestService restService;

  @Autowired
  public TestController(RestService restService) {
    this.restService = restService;
  }

  @GetMapping("filtering")
  public String filterApprentices(Model model, @ModelAttribute SearchTerms searchTerms) {
    model.addAttribute("searchTerms", searchTerms);
    model.addAttribute("languages", restService.getAllLanguages());
    model.addAttribute("levels", restService.getAllLevels());
    model.addAttribute("apprentices", restService.getAllFilteredApprenticesWEB(searchTerms));
    return "apprentices";
  }

}
