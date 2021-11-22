package com.knpcode.springeureka2;

public class Account {
	  private String empId;
	  private String accountId;
	  private String branch;
	  Account(){
	    
	  }
	  Account(String empId, String accountId, String branch){
	    this.empId = empId;
	    this.accountId = accountId;
	    this.branch = branch;
	  }
	  public String getEmpId() {
	    return empId;
	  }
	  public void setEmpId(String empId) {
	    this.empId = empId;
	  }
	  public String getAccountId() {
	    return accountId;
	  }
	  public void setAccountId(String accountId) {
	    this.accountId = accountId;
	  }
	  public String getBranch() {
	    return branch;
	  }
	  public void setBranch(String branch) {
	    this.branch = branch;
	  }
	}
