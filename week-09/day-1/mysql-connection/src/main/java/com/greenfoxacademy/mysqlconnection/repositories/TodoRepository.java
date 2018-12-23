package com.greenfoxacademy.mysqlconnection.repositories;


import com.greenfoxacademy.mysqlconnection.models.Todo;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TodoRepository extends CrudRepository<Todo, Long> {
  List<Todo> findAllByUrgent(boolean urgent);

  List<Todo> findAllByDone(boolean done);

  @Query("select t from Todo t where t.title like %?1% or t.description like %?1%")
  List<Todo> findAllByContentOrDescription(String s);
}
