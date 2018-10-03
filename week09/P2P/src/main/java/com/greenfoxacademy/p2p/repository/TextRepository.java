package com.greenfoxacademy.p2p.repository;

import com.greenfoxacademy.p2p.model.Text;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TextRepository extends CrudRepository<Text, Long> {

}
