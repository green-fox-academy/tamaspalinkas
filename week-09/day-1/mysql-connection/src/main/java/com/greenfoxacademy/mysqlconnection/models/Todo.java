package com.greenfoxacademy.mysqlconnection.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Todo {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String title;
  private boolean urgent;
  private boolean done;
  private String content;
  private String description;

  public Todo() {
    urgent = false;
    done = false;
  }

  public Todo(String title) {
    this();
    this.title = title;
  }

  public Todo(String title, String content, String description) {
    this();
    this.title = title;
    this.content = content;
    this.description = description;

//    this.urgent = false;
//    this.done = false;
  }

  public String getTitle() {
    return title;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setUrgent(boolean urgent) {
    this.urgent = urgent;
  }

  public void setDone(boolean done) {
    this.done = done;
  }

  public Long getId() {
    return id;
  }

  public boolean getUrgent() {
    return urgent;
  }

  public boolean getDone() {
    return done;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
