package com.greenfoxacademy.basicwebshop.controllers;

import com.greenfoxacademy.basicwebshop.models.ShopItem;
import com.greenfoxacademy.basicwebshop.models.WebShop;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.PostConstruct;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

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
    webShop.addItem(new ShopItem("Running shoes", "Nike running shoes", 1000.0, 5));
  }


  @RequestMapping("/")
  public String greeting(Model model) {
    model.addAttribute("shopItems", webShop.getShopItems());
    return "index";
  }

  @GetMapping("/only-available")
  public String available(Model model) {

    List<ShopItem> availableItems = webShop.getShopItems()
            .stream()
            .filter(s -> s.getQuantity() > 0)
            .collect(Collectors.toList());
    model.addAttribute("shopItems", availableItems);
    return "index";
  }

  @GetMapping("/most-expensive-available")
  public String mostExpensive(Model model) {
    ShopItem minPricedItem = webShop.getShopItems()
            .stream()
            .filter(s -> s.getQuantity() != 0)
            .max(Comparator.comparing(ShopItem::getPrice))
            .orElseThrow(NoSuchElementException::new);

    model.addAttribute("shopItems", minPricedItem);
    return "index";
  }

  @GetMapping("/cheapest-first")
  public String cheapestFirst(Model model) {
    List<ShopItem> ascendingPriceList = webShop.getShopItems()
            .stream()
            .sorted(Comparator.comparing(ShopItem::getPrice))
            .collect(Collectors.toList());
    model.addAttribute("shopItems", ascendingPriceList);
    return "index";
  }

  @GetMapping("/average-stock")
  public String averageStock(Model model) {
    double totalStock = webShop.getShopItems()
            .stream()
            .mapToDouble(o -> o.getQuantity()).sum();
    model.addAttribute("average", "Average Stock:" + totalStock / webShop.getShopItems().size());
    return "index";
  }

  @GetMapping("/nike")
  public String containsNike(Model model) {
    List<ShopItem> containsNike = webShop.getShopItems()
            .stream()
            .filter(o -> o.getDescription().toLowerCase().contains("nike") || o.getName().toLowerCase().contains("nike"))
            .collect(Collectors.toList());
    model.addAttribute("shopItems", containsNike);
    return "index";
  }

  @PostMapping("/search")
  public String search(Model model, @RequestParam("q") String p) {
    String searched = p.toLowerCase();
    List<ShopItem> containsSearch = webShop.getShopItems()
            .stream()
            .filter(o -> o.getName().toLowerCase().contains(searched) || o.getDescription().toLowerCase().contains(searched))
            .collect(Collectors.toList());
    model.addAttribute("shopItems", containsSearch);
    return "index";
  }
}
