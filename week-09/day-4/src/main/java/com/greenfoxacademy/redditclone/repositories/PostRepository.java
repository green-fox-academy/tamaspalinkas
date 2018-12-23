package com.greenfoxacademy.redditclone.repositories;

import com.greenfoxacademy.redditclone.models.RedditPost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<RedditPost, Long> {

}
