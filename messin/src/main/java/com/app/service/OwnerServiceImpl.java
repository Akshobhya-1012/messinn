package com.app.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.custom_exception.ResourceNotFoundException;
import com.app.dao.OwnerDao;
import com.app.dto.AdminDTO;
import com.app.dto.CredentialsDTO;
import com.app.dto.OwnerDTO;
import com.app.pojos.Admin;
import com.app.pojos.Customer;
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

	@Override
	public Owner fetchOwnerDetails(Long ownerId) {
		return ownerDao.findById(ownerId).orElseThrow(() -> 
						new ResourceNotFoundException("Invalid Owner ID !!!!!"));
	}

	@Override
	public Owner addOwner(Owner owner) {
		return ownerDao.save(owner);
	}
	
	@Override
	public Boolean findByEmail(String email) {
		if (ownerDao.findByEmail(email))
		return true;
		else 
			return false;
		
		
	}

	@Override
	public String deleteOwner(Long ownerId) {
		// chekc if owner exists by id
		if (ownerDao.existsById(ownerId)) {
			ownerDao.deleteById(ownerId);
			return "Owner details deleted ....";
		}
		return "Deletion Failed : Invalid Emp Id !!!!!!!!!!!";
	}

	@Override
	public Owner updateOwnerDetails(OwnerDTO detachedOwner) {
		if (ownerDao.existsById(detachedOwner.getId())) {
		Owner updOwner= ownerDao.getById(detachedOwner.getId());
		updOwner.setEmail(detachedOwner.getEmail());
		updOwner.setMob(detachedOwner.getMob());
		updOwner.setName(detachedOwner.getName());
		updOwner.setPassword(detachedOwner.getPassword());
			return ownerDao.save(updOwner);
		}

		else
		throw new ResourceNotFoundException("Invalid Owner Id : Updation Failed!!!!!!!!");
	}
	
	
	@Override
	public List<Owner> getAllOwnerDetails() {
		return ownerDao.findAll();
	}

	


}
