package com.management.bankAccountApp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.management.bankAccountApp.dto.Customer;
import com.management.bankAccountApp.repository.CustomerRepository;
import com.management.bankAccountApp.service.AccountService;

@Component
public class AccountServiceImpl implements AccountService{
	
	@Autowired
	RestTemplate restTemplate;
	
	@Value("${userAPIendpoint}")
	String userAPIendpoint;
	
	@Autowired
	CustomerRepository customerRepo;
		
	@Override
	public int updateAcountDetails(Customer customer) {
		
		int id = customer.getId();
		String name = customer.getName();
		String address = customer.getAddress();
		String state = customer.getState();
		String country = customer.getCountry();
		String email = customer.getEmail();
		String pan = customer.getPan();
		String contact = customer.getContact();
		String dob = customer.getDob();
		String accountType = customer.getAccountType();
		int status = customerRepo.updateCustomer(id, name, address, state, country, email, pan, contact, dob, accountType);
		return status;
	}

}
