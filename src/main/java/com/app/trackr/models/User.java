package com.app.trackr.models;

import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
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
@Table(name = "User")
public class User {

  @Id
  @GeneratedValue
  private Long id;

  @NonNull
  @Column(name = "username")
  private String username;

  @OneToMany(mappedBy = "user")
  private List<Log> logs;
}
