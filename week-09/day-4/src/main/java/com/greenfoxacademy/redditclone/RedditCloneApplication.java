package com.greenfoxacademy.redditclone;

import com.greenfoxacademy.redditclone.models.RedditPost;
import com.greenfoxacademy.redditclone.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedditCloneApplication implements CommandLineRunner {

  @Autowired
  PostRepository postRepository;

  public static void main(String[] args) {
    SpringApplication.run(RedditCloneApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    postRepository.save(new RedditPost("test_1", 51));
    postRepository.save(new RedditPost("test_2", 1));
    postRepository.save(new RedditPost("test_3", 5));

    for (int i = 0; i < 30 ; i++) {
      postRepository.save(new RedditPost("test" + i,i));
    }
  }
}

