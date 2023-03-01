package com.app.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.custom_exception.ResourceNotFoundException;
import com.app.dao.OwnerDao;
import com.app.dto.AdminDTO;
import com.app.dto.CredentialsDTO;
import com.app.dto.OwnerDTO;
import com.app.pojos.Owner;

@Service
@Transactional
public class OwnerServiceImpl implements OwnerService {
	
	@Autowired
	private OwnerDao ownerDao;
	
	@Autowired
	private ModelMapper mapper;
	
	@Override
	public OwnerDTO authenticateOwner(CredentialsDTO dto) {
		Owner owner = ownerDao.findByEmailAndPassword(dto.getEmail(), dto.getPassword())
				.orElseThrow(() -> new ResourceNotFoundException("Bad Credentials !!!!!"));
		// => success
		return mapper.map(owner, OwnerDTO.class);
	}

}
