package com.app.service;


import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.app.dto.CredentialsDTO;
import com.app.dto.CustomerDTO;
import com.app.pojos.Customer;


public interface CustomerService {

	CustomerDTO authenticateCustomer(CredentialsDTO dto);
	
	Customer updateCustomerDetails(CustomerDTO detachedCustomer);

	Boolean findByEmail(String email);

	List<Customer> getAllCustDetails();
	

	

	
}
