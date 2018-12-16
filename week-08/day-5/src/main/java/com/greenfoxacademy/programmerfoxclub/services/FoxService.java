package com.greenfoxacademy.programmerfoxclub.services;

import com.greenfoxacademy.programmerfoxclub.models.Fox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class FoxService {
  List<Fox> foxes;

  @Autowired
  public FoxService() {
    foxes = new ArrayList<>();
  }

  public void addFox(String name) {
    foxes.add(new Fox(name));
  }

  public List<Fox> getFoxes() {
    return foxes;
  }

  public List<String> getFoxNames() {
    List<String> names = new ArrayList<>();
    for (Fox fox : foxes) {
      names.add(fox.getName());
    }
    return names;
  }

  public Optional<Fox> findFox(String name) {
    System.out.println(getFoxes().size());
    if (!getFoxes().isEmpty()) {
      for (Fox fox : foxes) {
        if (name.equals(fox.getName())) {
          Optional<Fox> optionalFox = Optional.of(fox);
          return optionalFox;
        }
      }
    }
    return Optional.empty();
  }
}
