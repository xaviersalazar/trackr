package com.app.trackr.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.app.trackr.models.Log;

public interface LogRepo extends JpaRepository<Log, Long> {
  
}
