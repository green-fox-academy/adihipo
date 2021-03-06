package com.greenfoxacademy.p2p.repository;

import com.greenfoxacademy.p2p.model.Text;
import com.greenfoxacademy.p2p.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TextRepository extends CrudRepository<Text, Long> {

  List<Text> findAll();

  List<Text> findByUser(User user);

}
