package com.greenfoxacademy.redditclone.controllers;

import com.greenfoxacademy.redditclone.models.User;
import com.greenfoxacademy.redditclone.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class UserController {
  UserService userService;

  @Autowired
  public UserController(UserService userService) {
    this.userService = userService;
  }

  @PostMapping("/login")
  public String login(@ModelAttribute User user, RedirectAttributes attributes) {
    userService.saveUser(user);
    attributes.addAttribute("userId", user.getId());
    return "redirect:/";
  }
}
