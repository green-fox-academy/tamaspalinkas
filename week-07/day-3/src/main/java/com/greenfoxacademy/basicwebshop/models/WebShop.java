package com.greenfoxacademy.basicwebshop.models;

import java.util.ArrayList;
import java.util.List;

public class WebShop {
  private List<ShopItem> shopItems;

  public List<ShopItem> getShopItems() {
    return shopItems;
  }

  public WebShop() {
    shopItems = new ArrayList<>();
  }

  public void addItem(ShopItem shopItem) {
    shopItems.add(shopItem);
  }
}
