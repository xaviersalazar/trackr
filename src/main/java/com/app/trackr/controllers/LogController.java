package com.app.trackr.controllers;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.app.trackr.models.Log;
import com.app.trackr.repositories.LogRepo;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/logs")
public class LogController {
  
  @Autowired
  private LogRepo logRepo;

  @GetMapping
  ResponseEntity<List<Log>> getLogs() {
    return ResponseEntity.ok().body(logRepo.findAllByOrderByIdDesc());
  }
  
  @GetMapping("/latest")
  ResponseEntity<Log> getLatestLog() {
    Optional<Log> log = logRepo.findTopByOrderByIdDesc();
    
    return log.map(response -> ResponseEntity.ok().body(response)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
  }

  @PostMapping
  Log addLog(@RequestBody Log log) {
    return logRepo.save(log);
  };

}
