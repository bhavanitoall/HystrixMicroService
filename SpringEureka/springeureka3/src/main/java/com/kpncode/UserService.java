package com.kpncode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;


@Service
public class UserService {
	@Autowired
	private RestTemplate restTemplate;
	
  @HystrixCommand(fallbackMethod = "defaultAccounts")
  public List<Account> showEmployees(@PathVariable("id") String id) {
    System.out.println(id);
//  List<Account> accounts = new RestTemplate().exchange(
//    "http://localhost:9000/accounts/{empId}", HttpMethod.GET, null, new
//     ParameterizedTypeReference<List<Account>>(){}, id).getBody();
        
    List<Account> accounts = restTemplate.exchange(
    "http://ACCOUNT/accounts/{empId}", HttpMethod.GET, null, new
    ParameterizedTypeReference<List<Account>>(){}, id).getBody();
    for(Account acct : accounts) {
      System.out.println(acct.getEmpId());
      System.out.println(acct.getAccountId());
      System.out.println(acct.getBranch());
    }
    return accounts;        	
  }
//Fall back method used in case circuit is opened
 public List<Account> defaultAccounts(String id) {
   return Collections.emptyList();
 }
}
