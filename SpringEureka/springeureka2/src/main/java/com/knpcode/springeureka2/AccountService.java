package com.knpcode.springeureka2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class AccountService {
  public List<Account> findAccountsByEmpId(String empId){
    List<Account> accountList = getAccountList();
    List<Account> empAccountList = new ArrayList<>();
    for(Account account :  accountList) {
      if(account.getEmpId().equals(empId))
        empAccountList.add(account);
    }
    return empAccountList;
  }
    
  private List<Account> getAccountList(){
    List<Account> accountList = new ArrayList<>();
    accountList.add(new Account("1", "AC1", "MT"));
    accountList.add(new Account("1", "AC2", "IN"));
    accountList.add(new Account("2", "AC3", "IN"));
    return accountList;
  }
}
