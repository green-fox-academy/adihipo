package com.greenfoxacademy.p2p.repository;

import com.greenfoxacademy.p2p.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends CrudRepository<User, Long> {

  User findByName(String name);
}
