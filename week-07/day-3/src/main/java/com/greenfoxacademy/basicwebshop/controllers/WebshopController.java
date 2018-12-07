package com.greenfoxacademy.basicwebshop.controllers;

import com.greenfoxacademy.basicwebshop.models.ShopItem;
import com.greenfoxacademy.basicwebshop.models.WebShop;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.PostConstruct;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Controller
public class WebshopController {
  WebShop webShop;

  @PostConstruct
  public void init() {
    webShop = new WebShop();
    webShop.addItem(new ShopItem("Printer", "Some HP printer that will print pages", 3000.0, 2));
    webShop.addItem(new ShopItem("Coca cola", "0.5l standard coke", 25.0, 0));
    webShop.addItem(new ShopItem("Wokin", "Chicken with fried ricend WOKIN sauce", 119.0, 100));
    webShop.addItem(new ShopItem("T-shirt", "Blue with a corgi on a bike", 300.0, 1));

    webShop.addItem(new ShopItem("T-shirt", "Blue with a corgi on a bike", 300888.0, 0));
  }


  @RequestMapping("/")
  public String greeting(Model model) {
    model.addAttribute("shopItems", webShop.getShopItems());
    return "index";
  }

  @GetMapping("/available")
  public String available(Model model) {


    Stream<ShopItem> availableShopItems = webShop.getShopItems()
            .stream()
            .filter(s -> s.getQuantity() > 0);
    List<ShopItem> availableItems = availableShopItems.collect(Collectors.toList());

    model.addAttribute("shopItems", availableItems);
    return "index";
  }

  @RequestMapping("/most-expensive-available")
  public String mostExpensive(Model model) {
    ShopItem minPricedItem = webShop.getShopItems()
            .stream()
            .filter(s -> s.getQuantity() != 0)
            .max(Comparator.comparing(ShopItem::getPrice))
            .orElseThrow(NoSuchElementException::new);

    model.addAttribute("shopItems", minPricedItem);
    return "index";
  }
}
