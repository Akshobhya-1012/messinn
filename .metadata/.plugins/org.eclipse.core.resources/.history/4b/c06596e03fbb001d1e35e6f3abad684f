package com.app.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.custom_exception.ResourceNotFoundException;
import com.app.dao.CustomerDao;
import com.app.dto.CredentialsDTO;
import com.app.dto.CustomerDto;
import com.app.pojos.Customer;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;

	@Autowired
	private ModelMapper mapper;

	@Override
	public CustomerDto authenticateCustomer(CredentialsDTO dto) {
		// TODO Auto-generated method stub
		Customer customer = customerDao.findByEmailAndPassword(dto.getEmail(), dto.getPassword())
				.orElseThrow(() -> new ResourceNotFoundException("Bad Credentials !!!!!"));
		// => success
		return mapper.map(customer, CustomerDto.class);
	}

	@Override
	public Customer updateCustomerDetails(Customer detachedCustomer) {
		if (customerDao.existsById(detachedCustomer.getId())) {
			return customerDao.save(detachedCustomer);
		}
		throw new ResourceNotFoundException("Invalid Emp Id : Updation Failed!!!!!!!!");
		
	}

	@Override
	public Boolean findByEmail(String email) {
		if (customerDao.findByEmail(email))
		return true;
		else 
			return false;
		
		
	}

	

	 

	
	
	
	
	
	
	
	

	

}
