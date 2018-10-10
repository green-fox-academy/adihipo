package com.greenfoxacademy.authentication.contollers;

import com.greenfoxacademy.authentication.models.Goal;
import com.greenfoxacademy.authentication.services.BucketListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BucketListRESTController {

  private BucketListService bucketListService;

  @Autowired
  public BucketListRESTController(BucketListService bucketListService) {
    this.bucketListService = bucketListService;
  }

  @GetMapping("/api/list")
  public List<Goal> showList(){
    return bucketListService.getAllGoalsAsList();
  }

  


}
