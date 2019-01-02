package com.greenfoxacademy.redditclone.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String userName;
  @OneToMany(cascade = CascadeType.PERSIST, mappedBy = "user")
  private List<RedditPost> posts;

  public List<RedditPost> getPosts() {
    return posts;
  }

  public void setPosts(List<RedditPost> posts) {
    this.posts = posts;
  }

  public User() {
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }
}
