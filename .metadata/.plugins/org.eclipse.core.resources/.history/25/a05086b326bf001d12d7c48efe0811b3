package com.app.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.custom_exception.ResourceNotFoundException;
import com.app.dao.CustomerDao;
import com.app.dto.CredentialsDTO;
import com.app.dto.CustomerDTO;
import com.app.pojos.Customer;
import com.app.pojos.Owner;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDao customerDao;

	@Autowired
	private ModelMapper mapper;

	@Override
	public CustomerDTO authenticateCustomer(CredentialsDTO dto) {
		// TODO Auto-generated method stub
		Customer customer = customerDao.findByEmailAndPassword(dto.getEmail(), dto.getPassword())
				.orElseThrow(() -> new ResourceNotFoundException("Bad Credentials !!!!!"));
		// => success
		return mapper.map(customer, CustomerDTO.class);
	}

	@Override
	public Customer updateCustomerDetails(CustomerDTO detachedCustomer) {
		
		
		if (customerDao.existsById(detachedCustomer.getId())) {
			Customer updCustomer= customerDao.getById(detachedCustomer.getId());
			updCustomer.setEmail(detachedCustomer.getEmail());
			updCustomer.setMob(detachedCustomer.getMob());
			updCustomer.setName(detachedCustomer.getName());
			updCustomer.setPassword(detachedCustomer.getPassword());
			return customerDao.save(updCustomer);
		}
		throw new ResourceNotFoundException("Invalid Customer Id : Updation Failed!!!!!!!!");
		
	}

	@Override
	public Boolean findByEmail(String email) {
		if (customerDao.findByEmail(email))
		return true;
		else 
			return false;
		
		
	}
	
	@Override
	public List<Customer> getAllCustDetails() {
		return customerDao.findAll();
	}

	@Override
	public List<Customer> getCustByMess(Long Id)
	{
		return customerDao.findAllByMyMessId(Id);
	}

	 @Override
	 public Long noOfCustomers()
	 {
		 return customerDao.count();
	 }

	
	
	
	
	
	
	
	

	

}
