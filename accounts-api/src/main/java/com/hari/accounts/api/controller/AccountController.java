package com.hari.accounts.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hari.accounts.api.domain.Account;

@RestController
public class AccountController {
	
	@GetMapping(value = "/getAccounts",produces = MediaType.APPLICATION_XML_VALUE)
	public List<Account> getAccounts() {
		
		List<Account> accountList = new ArrayList<>();
		
		Account acc1 = new Account();
		acc1.setId(1);
		acc1.setAccountNumber("12345");
		accountList.add(acc1);
		
		Account acc2 = new Account();
		acc1.setId(2);
		acc1.setAccountNumber("123456");
		accountList.add(acc2);
		
		Account acc3 = new Account();
		acc1.setId(3);
		acc1.setAccountNumber("1234567");
		accountList.add(acc3);
		
		Account acc4 = new Account();
		acc1.setId(4);
		acc1.setAccountNumber("12345");
		accountList.add(acc4);
		
		Account acc5 = new Account();
		acc1.setId(5);
		acc1.setAccountNumber("1234533");
		accountList.add(acc5);
		
		return accountList;
	}
}
