package com.app.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.Admin;
import com.app.pojos.Owner;
import com.app.pojos.Mess_dish;
public interface Mess_DishDao extends JpaRepository<Mess_dish, Long>  {

}
