package com.greenfoxacademy.reddit.controller;

import com.greenfoxacademy.reddit.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RedditController {

  private PostService postService;

  @Autowired
  public RedditController(PostService postService) {
    this.postService = postService;
  }

  @GetMapping("/")
  public String showMain() {
    postService.getAllPosts();
    return "main";
  }

  @GetMapping("/submit")
  public String showSubmit() {
    return "submit";
  }

  @PostMapping("/submit")
  public String postSubmit(){
    return"redirect:";
  }

}
