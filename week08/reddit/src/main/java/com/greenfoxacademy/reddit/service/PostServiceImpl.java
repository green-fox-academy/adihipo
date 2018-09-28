package com.greenfoxacademy.reddit.service;

import com.greenfoxacademy.reddit.model.Post;
import com.greenfoxacademy.reddit.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class PostServiceImpl implements PostService {

  private PostRepository postRepository;

  @Autowired
  public PostServiceImpl(PostRepository postRepository) {
    this.postRepository = postRepository;
  }

  public void getAllPosts(Model model) {
    model.addAttribute("posts", postRepository.findAll());
  }

  public void saveNewPost(Post post) {
    postRepository.save(post);
  }

  public void createNewEmptyPost(Model model) {
    model.addAttribute("post", new Post());
  }
  
}
