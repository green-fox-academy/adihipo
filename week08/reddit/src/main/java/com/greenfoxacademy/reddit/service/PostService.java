package com.greenfoxacademy.reddit.service;

import com.greenfoxacademy.reddit.model.Post;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public interface PostService {

  void getAllPosts(Model model);
  void saveNewPost(Post post);

}
