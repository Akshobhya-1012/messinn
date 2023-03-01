package com.app.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.app.custom_exception.ResourceNotFoundException;
import com.app.dao.CustomerDao;
import com.app.dto.AdminDTO;
import com.app.dto.CredentialsDTO;
import com.app.dto.CustomerDto;
import com.app.pojos.Customer;

public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;

	@Autowired
	private ModelMapper mapper;

	public CustomerDto authenticateCustomer(CredentialsDTO dto) {
		// TODO Auto-generated method stub
		Customer customer = customerDao.findByEmailAndPassword(dto.getEmail(), dto.getPassword())
				.orElseThrow(() -> new ResourceNotFoundException("Bad Credentials !!!!!"));
		// => success
		return mapper.map(customer, CustomerDto.class);
	}

}
