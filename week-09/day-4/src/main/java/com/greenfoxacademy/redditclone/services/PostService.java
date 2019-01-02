package com.greenfoxacademy.redditclone.services;

import com.greenfoxacademy.redditclone.models.RedditPost;
import com.greenfoxacademy.redditclone.models.User;
import com.greenfoxacademy.redditclone.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


@Service
public class PostService {
  private PostRepository postRepository;

  @Autowired
  public PostService(PostRepository postRepository) {
    this.postRepository = postRepository;
  }

  public Iterable<RedditPost> findAll() {
    return postRepository.findAll();
  }

  public RedditPost findPost(long id) {
    if (postRepository.findById(id).isPresent()) {
      return postRepository.findById(id).get();
    }
    System.out.println("Id not found");
    return null;
  }

  public void upvotePost(RedditPost redditPost) {
    redditPost.setPoints(redditPost.getPoints() + 1);
    postRepository.save(redditPost);
  }

  public void downvotePost(RedditPost redditPost) {
    redditPost.setPoints(redditPost.getPoints() - 1);
    postRepository.save(redditPost);
  }

  public void addPost(RedditPost redditPost) {
    System.out.println(redditPost.getText());
    System.out.println(redditPost.getUser());
    postRepository.save(redditPost);
  }

  public Page findAllPaged(int page) {
    return postRepository.findAll(new PageRequest(page, 10, Sort.by("points").descending()));
  }

  public void addUser(RedditPost redditPost, User user) {
    redditPost.setUser(user);
  }

}
