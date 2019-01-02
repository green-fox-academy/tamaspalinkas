package com.greenfoxacademy.redditclone.controllers;

import com.greenfoxacademy.redditclone.models.RedditPost;
import com.greenfoxacademy.redditclone.models.User;
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

  //TODO extend index to show user for post
  @GetMapping("/")
  public String home(Model model, @RequestParam(defaultValue = "0") int page,
                     @RequestParam(name = "userId", required = false) Long userId) {

    if (userId == null) {
      return "login";
    } else {
      model.addAttribute("posts", postService.findAllPaged(page));
      model.addAttribute("page", page);
      model.addAttribute("userId", userId);
      return "index";
    }
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
  public String submit(@RequestParam(name = "userId") Long userId,
                       Model model) {
    model.addAttribute("userId", userId);
    return "submit";
  }

  @PostMapping("/add")
  public String addPost(@ModelAttribute RedditPost redditPost,
                        @ModelAttribute User user) {
    postService.addUser(redditPost,user);
    postService.addPost(redditPost);
    return "redirect:/";
  }
}
