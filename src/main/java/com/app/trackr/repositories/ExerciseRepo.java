package com.app.trackr.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.trackr.models.Exercise;

public interface ExerciseRepo extends JpaRepository<Exercise, Long> {
  
}
