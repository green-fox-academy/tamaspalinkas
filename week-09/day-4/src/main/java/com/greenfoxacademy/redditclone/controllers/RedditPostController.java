package com.greenfoxacademy.redditclone.controllers;

import com.greenfoxacademy.redditclone.models.RedditPost;
import com.greenfoxacademy.redditclone.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RedditPostController {
  private PostService postService;

  @Autowired
  public RedditPostController(PostService postService) {
    this.postService = postService;
  }

  @GetMapping("/")
  public String home(Model model, @RequestParam(defaultValue = "0") int page) {
    model.addAttribute("posts", postService.findAllPaged(page));
    model.addAttribute("page", page);
    return "index";
  }

  @GetMapping("{id}/upvote")
  public String upvote(@PathVariable Long id, @RequestParam String page) {
    postService.upvotePost((postService.findPost(id)));
    return "redirect:/?page=" + page;
  }

  @GetMapping("{id}/downvote")
  public String downVote(@PathVariable Long id, @RequestParam String page) {
    postService.downvotePost(postService.findPost(id));
    return "redirect:/?page=" + page;
  }

  @GetMapping("/add")
  public String submit() {
    return "submit";
  }

  @PostMapping("/add")
  public String addPost(@ModelAttribute RedditPost redditPost) {
    postService.addPost(redditPost);
    return "redirect:/";
  }
}
