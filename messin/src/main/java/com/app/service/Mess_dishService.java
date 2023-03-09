package com.app.service;

import java.util.List;

import com.app.dto.CredentialsDTO;
import com.app.dto.Mess_DishDTO;
import com.app.dto.OwnerDTO;
import com.app.pojos.Admin;
import com.app.pojos.Owner;
import com.app.pojos.Mess_dish;
public interface Mess_dishService {

	Mess_dish addDishToMess(Mess_DishDTO transientDish);

}
