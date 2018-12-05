package com.greenfoxacademy.springstart;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {
  static AtomicLong atomicLong = new AtomicLong(0);
  long id;
  String content;

  public Greeting(String content) {
    this.id = atomicLong.incrementAndGet();

    this.content = content;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }
}
