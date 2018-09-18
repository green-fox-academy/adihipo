package com.greenfoxacademy.simba.controller;

import com.greenfoxacademy.simba.model.BankAccount;
import com.greenfoxacademy.simba.model.ListOfBankAccounts;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BankAccountController {

  @GetMapping("/")
  public String welcome() {
    return "welcome";
  }

  @GetMapping("/account")
  public String show(Model model) {
    BankAccount bankAccount1 = new BankAccount("Simba", 2000, "lion", true, true);
    model.addAttribute("name", bankAccount1.getName());
    model.addAttribute("balance", bankAccount1.getBalance());
    model.addAttribute("animalType", bankAccount1.getAnimalType());
    return "bankaccount";
  }

  @GetMapping("/list/accounts")
  public String showAll(Model model) {
    ListOfBankAccounts listOfBankAccounts = new ListOfBankAccounts();
    BankAccount bankAccount1 = new BankAccount("Simba", 2000, "african lion", true, true);
    BankAccount bankAccount2 = new BankAccount("Nala", 10000, "african alion", false, true);
    BankAccount bankAccount3 = new BankAccount("Zazu", 70, "red-billed hornbill", false, true);
    BankAccount bankAccount4 = new BankAccount("Zira", 7000, "african lion", true, false);
    BankAccount bankAccount5 = new BankAccount("Timon", 115, "meerkat", false, true);
    BankAccount bankAccount6 = new BankAccount("Pumbaa", 210, "common warthog", false, true);
    BankAccount bankAccount7 = new BankAccount("Rafiki", 20000, "mandrill", false, true);
    listOfBankAccounts.add(bankAccount1);
    listOfBankAccounts.add(bankAccount2);
    listOfBankAccounts.add(bankAccount3);
    listOfBankAccounts.add(bankAccount4);
    listOfBankAccounts.add(bankAccount5);
    listOfBankAccounts.add(bankAccount6);
    listOfBankAccounts.add(bankAccount7);

    model.addAttribute("listOfBankAccounts", listOfBankAccounts.getBankAccountList());
    return "listofbankaccounts";
  }

  @PostMapping("/list/accounts")
  public String giveDonate() {
    return "listofbankaccounts";
  }
}
