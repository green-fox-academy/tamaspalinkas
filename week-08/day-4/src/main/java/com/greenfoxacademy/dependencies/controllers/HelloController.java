package com.greenfoxacademy.dependencies.controllers;

import com.greenfoxacademy.dependencies.services.MyColor;
import com.greenfoxacademy.dependencies.services.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;

@Controller
public class HelloController implements CommandLineRunner {
  private Printer printer;
  private MyColor myColor;

  @Autowired
  public HelloController(Printer printer, MyColor myColor) {
    this.printer = printer;
    this.myColor = myColor;
  }

  @Override
  public void run(String... args) throws Exception {
    printer.log("hello");
    myColor.printColor();
  }
}
