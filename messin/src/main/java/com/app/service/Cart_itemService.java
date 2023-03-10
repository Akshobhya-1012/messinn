package com.app.service;

import com.app.pojos.Cart_item;
import com.app.pojos.Dish;

public interface Cart_itemService {
 
	Cart_item addCart_item(Dish newDish);
	
	boolean removeCartItem(Long itemId);
	

}
