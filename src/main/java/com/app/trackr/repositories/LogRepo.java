package com.app.trackr.repositories;

import java.util.Optional;
import org.springframework.data.repository.Repository;
import com.app.trackr.models.Log;

public interface LogRepo extends Repository<Log, Long> {
  Optional<Log> findTopByOrderByIdDesc();
}
