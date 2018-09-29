package com.greenfoxacademy.matrixchecker.repository;

import com.greenfoxacademy.matrixchecker.model.Matrix;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MatrixRepository extends CrudRepository<Matrix, Long> {

  List<Matrix> findAll();
}
