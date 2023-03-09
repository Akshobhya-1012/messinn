package com.app.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.custom_exception.ResourceNotFoundException;
import com.app.dao.DishDao;
import com.app.dao.MessDao;
import com.app.dao.Mess_DishDao;
import com.app.dao.OwnerDao;
import com.app.dto.AdminDTO;
import com.app.dto.CredentialsDTO;
import com.app.dto.Mess_DishDTO;
import com.app.dto.OwnerDTO;
import com.app.pojos.Admin;
import com.app.pojos.Customer;
import com.app.pojos.Owner;
import com.app.pojos.Mess_dish;

@Service
@Transactional
public class Mess_dishServiceImpl implements Mess_dishService {


	@Autowired
	private DishDao dishDao;
	
	@Autowired
	private MessDao messDao;
	
	@Autowired
	private Mess_DishDao mess_DishDao;
	@Override
	public Mess_dish addDishToMess(Mess_DishDTO transientDish)
	{
		Mess_dish newDish = new Mess_dish();
		newDish.setdescription(transientDish.getDescription());
		newDish.setimage(transientDish.getImage());
		newDish.setMyDish(dishDao.getById(transientDish.getDishId()));
		newDish.setMyMess(messDao.getById(transientDish.getMessId()));
		newDish.setprice(transientDish.getPrice());
		
		return mess_DishDao.save(newDish);
	}
}
