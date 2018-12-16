package com.greenfoxacademy.programmerfoxclub.models;

import java.util.ArrayList;
import java.util.List;

public class Fox {
  private String name;
  private List<String> listOfTricks;
  private String food;
  private String drink;


  public Fox(String name) {
    this.name = name;
    this.listOfTricks = new ArrayList<>();
    this.food = "salad";
    this.drink = "water";
  }

  public String getName() {
    return name;
  }

  public List<String> getListOfTricks() {
    return listOfTricks;
  }

  public String getFood() {
    return food;
  }

  public String getDrink() {
    return drink;
  }

  public void addTricks(String trick) {
    listOfTricks.add(trick);
  }

  public void setFood(String food) {
    this.food = food;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }
}
