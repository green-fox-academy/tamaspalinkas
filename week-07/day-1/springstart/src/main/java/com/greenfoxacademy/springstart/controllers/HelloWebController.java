package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class HelloWebController {
  static AtomicLong atomicLong = new AtomicLong(0);
  long cnt;

  @RequestMapping("/web/greeting")
  public String greeting(Model model, @RequestParam String p) {
    model.addAttribute("name", p);
    model.addAttribute("counter", cnt);
    cnt = atomicLong.incrementAndGet();
    return "greeting";
  }

}
