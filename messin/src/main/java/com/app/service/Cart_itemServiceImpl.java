package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.pojos.Cart_item;
import com.app.pojos.Dish;
import com.app.dao.Cart_itemDao;

@Service
@Transactional
public class Cart_itemServiceImpl implements Cart_itemService{
 
	@Autowired
	private Cart_itemDao cart_itemDao;
	
	
	@Override
	public Cart_item addCart_item(Dish newDish) {
		Cart_item newCart_item=new Cart_item();
		//newCart_item.setService(newDish);
		newCart_item.setQuantity(1);
		newCart_item.setTotalPrice(newDish.getPrice());
		cart_itemDao.save(newCart_item);
		return newCart_item;
	}


	@Override
	public boolean removeCartItem(Long itemId) {
		if(cart_itemDao.existsById(itemId)) {
			cart_itemDao.deleteById(itemId);
		      return true;
		}
		return false;
	}


}