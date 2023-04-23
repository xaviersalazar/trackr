package com.app.trackr.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.trackr.models.User;

public interface UserRepo extends JpaRepository<User, Long> {
  
}
