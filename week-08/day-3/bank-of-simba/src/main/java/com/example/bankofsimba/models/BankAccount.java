package com.example.bankofsimba.models;

public class BankAccount {
  private String name;
  private double balance;
  private String animalType;
  private boolean isKing;
  private String goodOrBad;

  public BankAccount(String name, double balance, String animalType, boolean isKing, String goodOrBad) {
    this.name = name;
    this.balance = balance;
    this.animalType = animalType;
    this.isKing = isKing;
    this.goodOrBad = goodOrBad;
  }

  public String getName() {
    return name;
  }

  public double getBalance() {
    return balance;
  }

  public String getAnimalType() {
    return animalType;
  }

  public boolean getIsKing() {
    return isKing;
  }

  public String getGoodOrBad() {
    return goodOrBad;
  }

  public void topUp() {
    if (isKing) {
      balance += 100;
    } else {
      balance += 10;
    }
  }

}
