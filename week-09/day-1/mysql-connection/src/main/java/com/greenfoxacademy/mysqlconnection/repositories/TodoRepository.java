package com.greenfoxacademy.mysqlconnection.repositories;


import com.greenfoxacademy.mysqlconnection.models.Todo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TodoRepository extends CrudRepository<Todo, Long> {
  List<Todo> findAllByUrgent(boolean urgent);
  List<Todo> findAllByDone(boolean urgent);
}
