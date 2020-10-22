package com.management.bankAccountApp.service;

import org.springframework.stereotype.Service;

import com.management.bankAccountApp.dto.Customer;

@Service
public interface AccountService {
	
	public int updateAcountDetails(Customer customer);

}
