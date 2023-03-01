package com.app.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.Customer;

public interface CustomerDao extends JpaRepository<Customer, Long> {
	
	Optional<Customer> findByEmailAndPassword(String em, String pass);
}
