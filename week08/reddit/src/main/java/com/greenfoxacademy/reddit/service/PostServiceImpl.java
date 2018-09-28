package com.greenfoxacademy.reddit.service;

import com.greenfoxacademy.reddit.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class PostServiceImpl implements PostService {

  private PostRepository postRepository;
  private Model model;

  @Autowired
  public PostServiceImpl(PostRepository postRepository) {
    this.postRepository = postRepository;
  }

  public void getAllPosts() {
    model.addAttribute(postRepository.findAll());
  }


}
