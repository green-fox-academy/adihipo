package com.greenfoxacademy.authentication.contollers;

import com.greenfoxacademy.authentication.services.BucketListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BucketListRESTController {

  private BucketListService bucketListService;

  @Autowired
  public BucketListRESTController(BucketListService bucketListService) {
    this.bucketListService = bucketListService;
  }




}
