package com.app.service;

import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.custom_exception.ResourceNotFoundException;
import com.app.dao.CustomerDao;
import com.app.dao.MessDao;
import com.app.dao.OwnerDao;
import com.app.dto.MessDTO;
import com.app.dto.CredentialsDTO;
import com.app.dto.CustomerDTO;
import com.app.pojos.Customer;
import com.app.pojos.Mess;
import com.app.pojos.Owner;

@Service
@Transactional
public class MessServiceImpl implements MessService{

	
	@Autowired
	private MessDao messDao;
	
	@Autowired
	private OwnerDao ownerDao;

	@Autowired
	private ModelMapper mapper;
	
	@Override
	public Mess updateMessDetails(MessDTO detachedMess) {
		
		
		if (messDao.existsById(detachedMess.getId())) {
			Mess updMess= messDao.getById(detachedMess.getId());
			updMess.setaddress(detachedMess.getAddress());
			updMess.setmob(detachedMess.getMob());
			updMess.setname(detachedMess.getName());
			updMess.setMyOwner(ownerDao.getById(detachedMess.getOwnerid()));
			return messDao.save(updMess);
		}
		throw new ResourceNotFoundException("Invalid Mess Id : Updation Failed!!!!!!!!");
		
	}
	
	@Override
	public List<Mess> getAllMessDetails() {
		return messDao.findAll();
	}
	
	@Override
	public Mess addMess(MessDTO transientMess)
	{
		Mess newMess=new Mess();
		newMess.setaddress(transientMess.getAddress());
		newMess.setmob(transientMess.getMob());
		newMess.setname(transientMess.getName());
		newMess.setMyOwner(ownerDao.getById(transientMess.getOwnerid()));
		newMess.setImage(transientMess.getImage());
		//System.out.println();
		return messDao.save(newMess);
		
	}
	
	
	@Override
	public List<Mess> getMessByOwner(Long Id)
	{
		return messDao.findAllByMyOwnerId(Id);
	}
	
	@Override
	 public Long noOfMess()
	 {
		 return messDao.count();
	 }

	@Override
	public Mess getMessByMess(Long Id)
	{
		return messDao.findById(Id).orElseThrow();
	}
	
}
