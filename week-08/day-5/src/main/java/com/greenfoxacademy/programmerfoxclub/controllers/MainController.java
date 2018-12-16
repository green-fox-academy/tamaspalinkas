package com.greenfoxacademy.programmerfoxclub.controllers;

import com.greenfoxacademy.programmerfoxclub.models.Fox;
import com.greenfoxacademy.programmerfoxclub.services.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
public class MainController {
  private FoxService foxService;

  @Autowired
  public MainController(FoxService foxService) {
    this.foxService = foxService;
  }

  @GetMapping("/")
  public String index(Model model, @RequestParam(value = "name", required = false) String name) {
    if (name == null) {
      return "redirect:/login";
    } else {
      Optional<Fox> optionalFox = foxService.findFox(name);
      if (optionalFox.isPresent()) {
        model.addAttribute("fox", optionalFox.get());
        return "index";
      } else {
        return "redirect:/login";
      }
    }
  }

  @GetMapping("/login")
  public String loginPage() {
    return "login";
  }

  @PostMapping("/login")
  public String login(@RequestParam(name = "name") String name,
                      RedirectAttributes attributes) {
    //TODO only add fox when name is not taken & login to fox if name exists
    foxService.addFox(name);
    attributes.addAttribute("name", name);
    return "redirect:/";
  }

  @GetMapping("/nutritionStore")
  public String nutrition(@RequestParam(name = "name") String name, Model model,
                          RedirectAttributes attributes) {
    model.addAttribute("fox", foxService.findFox(name));
    model.addAttribute("name", name);
    model.addAttribute("fox", foxService.findFox(name).get());
    return "nutrition";
  }

  //TODO impl addition of custom items to list
  @PostMapping("/nutritionStore")
  public String changeNutrition(@RequestParam(name = "food") String food,
                                @RequestParam(name = "drink") String drink,
                                @RequestParam(name = "name") String name,
                                RedirectAttributes attributes,
                                Model model) {
    Optional<Fox> optionalFox = foxService.findFox(name);
    if (optionalFox.isPresent()) {
      optionalFox.get().setFood(food);
      optionalFox.get().setDrink(drink);
      model.addAttribute("fox", foxService.findFox(name).get());
      attributes.addAttribute("name", name);
      return "redirect:/";
    } else {
      return "redirect:/login";
    }
  }

  @GetMapping("/trickCenter")
  public String displayTrickCenter(@RequestParam(name = "name") String name, Model model) {
    Optional<Fox> optionalFox = foxService.findFox(name);
    if (optionalFox.isPresent()) {
      model.addAttribute("fox", optionalFox.get());
      return "trick-center";
    } else {
      return "redirect:/";
    }
  }

  @PostMapping("/trickCenter")
  public String addTrick(@RequestParam(name = "name") String name,
                         @RequestParam(name = "trick") String trick,
                         RedirectAttributes attributes,
                         Model model) {
    Optional<Fox> optionalFox = foxService.findFox(name);
    if (optionalFox.isPresent()) {
      optionalFox.get().addTricks(trick);
      attributes.addAttribute("name", name);
      return "redirect:/";
    } else {
      return "redirect:/";
    }
  }
}
