package com.greenfoxacademy.mysqlconnection;

import com.greenfoxacademy.mysqlconnection.models.Todo;
import com.greenfoxacademy.mysqlconnection.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MysqlConnectionApplication implements CommandLineRunner {

  @Autowired
  TodoRepository todoRepository;

  public static void main(String[] args) {
    SpringApplication.run(MysqlConnectionApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    todoRepository.save(new Todo("Todo 1"));
    todoRepository.save(new Todo("Todo 2"));
    todoRepository.save(new Todo("Todo 3"));

    Todo todo1 = todoRepository.findById(1L).get();
    todo1.setDone(true);
    todo1.setUrgent(true);
    todoRepository.save(todo1);

    Todo todo2 = todoRepository.findById(2L).get();
    todo2.setUrgent(true);
    todoRepository.save(todo2);
  }
}

