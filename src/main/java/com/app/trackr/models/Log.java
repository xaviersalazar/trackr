package com.app.trackr.models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@Table
public class Log {

  @Id
  @GeneratedValue
  private Long id;

  @NonNull
  @Column
  private String timestamp;

  @OneToMany(cascade = CascadeType.ALL)
  @JoinColumn(name = "log_id")
  private List<Exercise> exercises;
}
