package com.hari.biller.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class BillerController {
	
	@Autowired
	private RestTemplate restTemplate;

	@GetMapping(value="/getBillers")
	public ResponseEntity<List<String>> getBillers(){
		List<String> billersList = new ArrayList<>();
		
		billersList.add("Airtel");
		billersList.add("Jio");
		billersList.add("Bsnl");
		billersList.add("Billdesk");
		billersList.add("Shop");
		
		String accounts = restTemplate.getForObject("http://accounts-api/getAccounts", String.class);
		
		System.out.println("accounts list :::   "+accounts);
		
		return ResponseEntity.ok(billersList);
	}
}
