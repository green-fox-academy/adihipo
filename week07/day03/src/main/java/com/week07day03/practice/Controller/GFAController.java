package com.week07day03.practice.Controller;

import com.week07day03.practice.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GFAController {

  StudentService studentList;

  @Autowired
  public GFAController(StudentService studentList) {
    this.studentList = studentList;
  }

  @GetMapping("/gfa")
  public String showGFAhome() {
    return "gfahome";
  }

  @GetMapping("/gfa/list")
  public String showGFAstudents(Model model) {
    model.addAttribute("list", studentList.findAll());
    return "gfahomelist";
  }

  @GetMapping("/gfa/add")
  public String showGFAAddStudent() {
    return "gfahomeadd";
  }

}
