package com.greenfoxacademy.springstart.controllers;

import com.greenfoxacademy.springstart.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Random;


@Controller
public class HelloWebController {

  @RequestMapping("/web/greeting")
  public String greeting(Model model, @RequestParam String p) {
    model.addAttribute("name", p);

    Greeting greeting = new Greeting(p);
    model.addAttribute("counter", greeting.getId());
    model.addAttribute("randomGreeting", greeting.getRandomGreeting());
    model.addAttribute("style", randomColor() + randomSize());
    return "greeting";
  }

  public String randomSize() {
    int rand = (int) (Math.random() * 50) + 10;
    return String.format("; font-size:%dpx", rand);
  }

  public String randomColor() {
    Random random = new Random();
    int r = random.nextInt(255);
    int g = random.nextInt(255);
    int b = random.nextInt(255);

    return String.format("color:rgb(%d,%d,%d);", r, g, b);
  }
}
