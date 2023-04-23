package com.app.trackr.controllers;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.app.trackr.models.Log;
import com.app.trackr.repositories.LogRepo;

@RestController
@RequestMapping("/logs")
public class LogController {
  
  @Autowired
  private LogRepo logRepo;

  @GetMapping
  Collection<Log> logs() {
    return logRepo.findAll();
  }
}
