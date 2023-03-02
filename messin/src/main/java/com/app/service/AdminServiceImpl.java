package com.app.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.custom_exception.ResourceNotFoundException;
import com.app.dao.AdminDao;
import com.app.dto.AdminDTO;
import com.app.dto.CredentialsDTO;
import com.app.pojos.Admin;
import com.app.pojos.Owner;

@Service
@Transactional
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminDao adminDao;

	@Autowired
	private ModelMapper mapper;

	public AdminDTO authenticateAdmin(CredentialsDTO dto) {
		// TODO Auto-generated method stub
		Admin admin = adminDao.findByEmailAndPassword(dto.getEmail(), dto.getPassword())
				.orElseThrow(() -> new ResourceNotFoundException("Bad Credentials !!!!!"));
		// => success
		return mapper.map(admin, AdminDTO.class);

	}

	
	

}
