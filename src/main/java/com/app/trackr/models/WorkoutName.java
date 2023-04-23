package com.app.trackr.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
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
@Table(name = "Workout_Name")
public class WorkoutName {

  @Id
  @GeneratedValue
  private Long id;

  @NonNull
  private String name;

  @OneToOne(mappedBy = "workoutName")
  private Exercise exercise;
}
