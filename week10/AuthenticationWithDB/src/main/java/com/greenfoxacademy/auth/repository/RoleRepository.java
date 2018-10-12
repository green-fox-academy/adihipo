package com.greenfoxacademy.auth.repository;

import java.util.Optional;

import com.greenfoxacademy.auth.model.Role;
import com.greenfoxacademy.auth.model.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
  Optional<Role> findByName(RoleName roleName);
}