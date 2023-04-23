package com.app.trackr.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
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
@Table(name = "Exercise")
public class Exercise {

  @Id
  @GeneratedValue
  private Long id;

  @NonNull
  @Column(name = "numOfSets")
  private Integer numOfSets;

  @NonNull
  @Column(name = "numOfReps")
  private Integer numOfReps;

  @ManyToOne
  @JoinColumn(name = "logId")
  private Log log;

  @OneToOne
  @JoinColumn(name = "workoutNameId")
  private WorkoutName workoutName;
}
