package com.management.bankAccountApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.management.bankAccountApp.dto.Customer;
import com.management.bankAccountApp.repository.CustomerRepository;
import com.management.bankAccountApp.service.AccountService;

@RequestMapping("/accountSystem")
@Controller
public class AccountController {
	
	@Autowired
	CustomerRepository customerRepo;
	
	@Autowired
	AccountService accountService;
	
	//Update Account Service
	@RequestMapping(value = "/updateAccountDetails", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	   public ResponseEntity<Object> updateAccountDetails(@RequestBody Customer customer) {
		int status = accountService.updateAcountDetails(customer);
	    return new ResponseEntity<>(customer, HttpStatus.CREATED);
	   }
}
