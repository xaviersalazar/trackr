package com.app.trackr.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.app.trackr.models.WorkoutName;

public interface WorkoutNameRepo extends JpaRepository<WorkoutName, Long> {
  
}
