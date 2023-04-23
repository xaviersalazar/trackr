package com.app.trackr.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
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
@Table
public class Exercise {

  @Id
  @GeneratedValue
  private Long id;

  @NonNull
  @Column
  private Integer numOfSets;

  @NonNull
  @Column
  private Integer numOfReps;

  @OneToOne
  @JoinColumn(referencedColumnName = "id")
  private WorkoutName workoutName;
}
