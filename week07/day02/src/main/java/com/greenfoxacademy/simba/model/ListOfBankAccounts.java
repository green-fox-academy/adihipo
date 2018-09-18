package com.greenfoxacademy.simba.model;

import java.util.ArrayList;
import java.util.List;

public class ListOfBankAccounts {

  private List<BankAccount> bankAccountList;

  public List<BankAccount> getBankAccountList() {
    return bankAccountList;
  }

  public void setBankAccountList(List<BankAccount> bankAccountList) {
    this.bankAccountList = bankAccountList;
  }

  public ListOfBankAccounts() {
    bankAccountList = new ArrayList<>();
  }

  public void add(BankAccount bankAccount) {
    bankAccountList.add(bankAccount);
  }
}
