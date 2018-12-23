package com.greenfoxacademy.dependencies.controllers;

import com.greenfoxacademy.dependencies.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UsefulUtilitiesController {
  UtilityService utilityService;

  @Autowired
  public UsefulUtilitiesController(UtilityService utilityService) {
    this.utilityService = utilityService;
  }

  @GetMapping("/useful")
  public String showUseful() {
    return "links.html";
  }

  @GetMapping("/useful/colored")
  public String coloredBackground(Model model) {
    model.addAttribute("color", utilityService.randomColor());
    return "colored-page.html";
  }

  @GetMapping("useful/email")
  public String emailValidator(@RequestParam(name = "email") String p, Model model) {
    model.addAttribute("email", p);
    if (utilityService.validateEmail(p)) {
      model.addAttribute("color", "color:green");
    } else {
      model.addAttribute("color", "color:red");
    }
    return "index";
  }

  @GetMapping("/useful/encoder")
  public String caesarEncode() {
    return "caesar";
  }

  @ResponseBody
  @GetMapping("/useful/encoder/encode")
  public String caesarEncodeWithParams(@RequestParam(name = "text") String text, @RequestParam(name = "number") int i) {
    return utilityService.caesar(text, i);
  }
}
