package com.kpncode;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
  @GetMapping(value="/{id}")
  public List<Account> showEmployees(@PathVariable("id") String id) {
    //System.out.println(id);       
    List<Account> accounts = userService.showEmployees(id);
    return accounts;        	
  }
}
