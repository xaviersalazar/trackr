package com.app.trackr.repositories;

import java.util.List;
import java.util.Optional;
import org.springframework.data.repository.Repository;
import com.app.trackr.models.Log;

public interface LogRepo extends Repository<Log, Long> {
  // Find all Log's in descending order
  List<Log> findAllByOrderByIdDesc();
  
  // Find most recent Log
  Optional<Log> findTopByOrderByIdDesc();
}
