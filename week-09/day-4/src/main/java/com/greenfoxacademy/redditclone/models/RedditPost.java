package com.greenfoxacademy.redditclone.models;

import javax.persistence.*;
import java.util.Date;

@Entity
public class RedditPost {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String text;
  private int points;
  @Temporal(TemporalType.DATE)
  private Date dateAdded;

  public RedditPost() {
    this.dateAdded = new Date();
  }

  public RedditPost(String text, int points) {
    this.text = text;
    this.points = points;
    this.dateAdded = new Date();
  }


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public int getPoints() {
    return points;
  }

  public void setPoints(int points) {
    this.points = points;
  }

  public Date getDateAdded() {
    return dateAdded;
  }

  public void setDateAdded(Date dateAdded) {
    this.dateAdded = dateAdded;
  }
}
