package com.greenfoxacademy.mysqlconnection.controllers;

import com.greenfoxacademy.mysqlconnection.models.Todo;
import com.greenfoxacademy.mysqlconnection.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/todo")
public class TodoController {

  TodoRepository todoRepository;

  @Autowired
  public TodoController(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  @GetMapping({"/", "/list"})
  public String list(Model model, @RequestParam(name = "isActive", required = false) String isActive,
                     @RequestParam(name = "searchItem", required = false) String searchItem) {
    if (searchItem == null) {
      model.addAttribute("todoList", todoRepository.findAll());
      return "todoList";
    } else {
      System.out.println(searchItem);
      //model.addAttribute("todoList", todoRepository.findAllByTitle(searchItem));
      if (todoRepository.findAllByContentOrDescription(searchItem).isEmpty()) {
        System.out.println("EMPTY QUERY RESULT");
      }
      model.addAttribute("todoList", todoRepository.findAllByContentOrDescription(searchItem));
      return "todoList";
    }
//    if (isActive == null) {
//      model.addAttribute("todoList", todoRepository.findAll());
//      return "todolist";
//    } else {
//      switch (isActive) {
//        case "true":
//          model.addAttribute(todoRepository.findAllByDone(false));
//          break;
//      }
//    }
//    return "todoList";
  }

  @GetMapping("/add")
  public String view() {
    return "form";
  }

  @PostMapping("/add")
  public String addTodo(@RequestParam(name = "description") String description) {
    todoRepository.save(new Todo(description));
    return "redirect:/todo/list";
  }

  @GetMapping("/delete")
  public String deleteTodo(@RequestParam(name = "id") Long id) {
    todoRepository.deleteById(id);
    return "redirect:/todo/list";
  }

  @GetMapping("/update")
  public String update(@RequestParam(name = "id") Long id, Model model) {
    model.addAttribute("todoTask", todoRepository.findById(id).get());
    return "update";
  }

  @PostMapping("/update")
  public String applyUpdate(@ModelAttribute("todoTask") Todo todo) {
    todoRepository.save(todo);
    return "redirect:/todo/list";
  }
}
