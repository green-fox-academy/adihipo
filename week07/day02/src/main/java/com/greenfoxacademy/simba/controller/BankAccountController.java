package com.greenfoxacademy.simba.controller;

import com.greenfoxacademy.simba.model.BankAccount;
import com.greenfoxacademy.simba.model.ListOfBankAccounts;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class BankAccountController {

  @GetMapping("/")
  public String welcome() {
    return "welcome";
  }

  @GetMapping("/account")
  public String show(Model model) {
    BankAccount bankAccount1 = new BankAccount("Simba", 2000, "lion");
    model.addAttribute("name", bankAccount1.getName());
    model.addAttribute("balance", bankAccount1.getBalance());
    model.addAttribute("animalType", bankAccount1.getAnimalType());
    return "bankaccount";
  }

  @GetMapping("/list/accounts")
  public String showAll(Model model) {
    ListOfBankAccounts listOfBankAccounts = new ListOfBankAccounts();
    BankAccount bankAccount1 = new BankAccount("Simba", 2000, "african lion");
    BankAccount bankAccount2 = new BankAccount("Nala", 10000, "african alion");
    BankAccount bankAccount3 = new BankAccount("Zazu", 70, "red-billed hornbill");
    BankAccount bankAccount4 = new BankAccount("Timon", 115, "meerkat");
    BankAccount bankAccount5 = new BankAccount("Pumbaa", 210, "common warthog");
    BankAccount bankAccount6 = new BankAccount("Rafiki", 20000, "mandrill");
    listOfBankAccounts.add(bankAccount1);
    listOfBankAccounts.add(bankAccount2);
    listOfBankAccounts.add(bankAccount3);
    listOfBankAccounts.add(bankAccount4);
    listOfBankAccounts.add(bankAccount5);
    listOfBankAccounts.add(bankAccount6);

    model.addAttribute("listOfBankAccounts", listOfBankAccounts.getBankAccountList());
    return "listofbankaccounts";
  }
}
