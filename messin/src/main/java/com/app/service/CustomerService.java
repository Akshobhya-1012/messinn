package com.app.service;


import com.app.dto.CredentialsDTO;
import com.app.dto.CustomerDto;

public interface CustomerService {

	CustomerDto authenticateCustomer(CredentialsDTO dto);
}
