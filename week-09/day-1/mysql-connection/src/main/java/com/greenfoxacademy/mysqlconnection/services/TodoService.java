package com.greenfoxacademy.mysqlconnection.services;

import com.greenfoxacademy.mysqlconnection.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

  @Autowired
  TodoRepository todoRepository;
}
