package com.app.service;


import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.app.dto.CredentialsDTO;
import com.app.dto.CustomerDto;
import com.app.pojos.Customer;


public interface CustomerService {

	CustomerDto authenticateCustomer(CredentialsDTO dto);
	
	Customer updateCustomerDetails(Customer detachedCustomer);

	Boolean findByEmail(String email);
	

	

	
}
