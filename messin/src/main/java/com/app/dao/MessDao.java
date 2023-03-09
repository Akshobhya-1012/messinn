package com.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.Admin;
import com.app.pojos.Customer;
import com.app.pojos.Mess;

public interface MessDao extends JpaRepository<Mess, Long>{

	
	Boolean findByName(String nm);
	Mess getById(Long Id);
	List<Mess> findAllByMyOwnerId(Long Id);
}
