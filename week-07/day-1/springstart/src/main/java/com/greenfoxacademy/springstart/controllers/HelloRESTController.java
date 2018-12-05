package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {

  @RequestMapping
  public Greeting greeting(@RequestParam String p) {
    Greeting greeting = new Greeting(1,"Hello " + p + "!");
    return greeting;
  }
}
