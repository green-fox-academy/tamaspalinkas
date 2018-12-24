package com.example.bankofsimba.controllers;

import com.example.bankofsimba.models.BankAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BankAccountController {
  private List<BankAccount> bankAccounts;

  @Autowired
  public BankAccountController() {
    this.bankAccounts = new ArrayList<>();
    bankAccounts.add(new BankAccount("Simba", 2000.345, "lion", false, "good"));
    bankAccounts.add(new BankAccount("Simbb", 3214, "zebra", true, "bad"));
    bankAccounts.add(new BankAccount("Simbc", 322, "frog", true, "bad"));
    bankAccounts.add(new BankAccount("Simbd", 200, "donkey", false, "good"));
    bankAccounts.add(new BankAccount("Simbe", 100, "fish", false, "good"));
  }

  @GetMapping("/show")
  public String showAccounts(Model model) {
    model.addAttribute("bankAccounts", bankAccounts);
    return "index";
  }

  @GetMapping("/display-string")
  public String displayString(Model model) {
    model.addAttribute("string", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
    return "display-string";
  }

  @PostMapping("/raise-balance")
  public String raiseBalance(@ModelAttribute(name = "name") String accountName) {
    for (BankAccount account : bankAccounts) {
      if (accountName.equals(account.getName())) {
        account.topUp();
      }
    }
    return "redirect:/show";
  }

  @PostMapping("/add-account")
  public String addAccount(@ModelAttribute BankAccount bankAccount) {
    bankAccounts.add(bankAccount);
    return "redirect:/show";
  }
}
