package com.app.service;

import java.beans.Encoder;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.custom_exception.ResourceNotFoundException;
import com.app.dao.AdminDao;
import com.app.dao.LoginDao;
import com.app.dto.AdminDTO;
import com.app.dto.CredentialsDTO;
import com.app.dto.SignUpDto;
import com.app.pojos.Admin;
import com.app.pojos.Login;
import com.app.pojos.Owner;

@Service
@Transactional
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminDao adminDao;

	@Autowired
	private ModelMapper mapper;
	
	@Autowired
	private LoginDao loginDao;
	
	@Autowired
	private PasswordEncoder encode;

	public AdminDTO authenticateAdmin(CredentialsDTO dto) {
		// TODO Auto-generated method stub
		Admin admin = adminDao.findByEmailAndPassword(dto.getEmail(), dto.getPassword())
				.orElseThrow(() -> new ResourceNotFoundException("Bad Credentials !!!!!"));
		// => success
		return mapper.map(admin, AdminDTO.class);

	}
	
	public Admin signUp(SignUpDto obj) {
		Admin admin = new Admin(obj.getName(), obj.getEmail(),obj.getMob(),obj.getPassword());
		Login login = new Login(obj.getUserName(),encode.encode(obj.getPassword()), obj.getRole());
		admin.setLogin(login);
		loginDao.save(login);
		return adminDao.save(admin);
	}

	
	

}
