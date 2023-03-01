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

	@Override
	public Admin updatePassword(String email, String password) {
		Admin admin = this.findAdminByEmail(email);
		if (admin != null) {
			admin.setPassword(password);
			return this.save(admin);
		}
		return null;
	}

	@Override
	public Admin save(Admin admin) {
		return adminDao.save(admin);
	}

	@Override
	public Admin findAdminById(Long id) {
		Optional<Admin> admin = adminDao.findById(id);
		return admin.orElse(null);

	}

	@Override
	public Admin findAdminByEmail(String email) {
		
		return null;
	}

	

}
