package com.greenfoxacademy.reddit.controller;

import com.greenfoxacademy.reddit.model.Post;
import com.greenfoxacademy.reddit.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RedditController {

  private PostService postService;

  @Autowired
  public RedditController(PostService postService) {
    this.postService = postService;
  }

  @GetMapping("/")
  public String showMain(Model model) {
    postService.getAllPosts(model);
    return "main";
  }

  @GetMapping("/submit")
  public String showSubmit(Model model) {
    postService.createNewEmptyPost(model);
    return "submit";
  }

  @PostMapping("/submit")
  public String postSubmit(@ModelAttribute(value = "post") Post post) {
    postService.saveNewPost(post);
    return "redirect:";
  }

}
