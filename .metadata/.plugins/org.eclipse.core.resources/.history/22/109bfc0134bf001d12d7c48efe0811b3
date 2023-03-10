package com.app.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.app.pojos.Admin;
import com.app.pojos.Owner;


public interface AdminDao extends JpaRepository<Admin, Long>
{
	Optional<Admin> findByEmailAndPassword(String em, String pass);

	Admin save(Owner owner);
	
	
	
}
