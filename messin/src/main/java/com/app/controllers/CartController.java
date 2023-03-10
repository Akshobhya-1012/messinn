package com.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.Cart;
import com.app.service.CartService;
//import com.app.service.CartServiceImpl;

@RestController
@RequestMapping("/cart")
@CrossOrigin(origins = "*")
public class CartController {

	@Autowired
	private CartService cart;
	
	@GetMapping("/addtocart")
	public Cart addToCart(@RequestParam Long customerId,@RequestParam Long dishId) {
		return cart.addToCart(customerId, dishId);
	}
	
	@GetMapping("/{customerId}")
	public Cart getCartDetailsByCustomerId(@PathVariable Long customerId) {
		return cart.getCartByCustomerId(customerId);
	}
	
	@GetMapping("/emptyCart")
	public void emptyCart(Long customerId) {
		 cart.clearCart(customerId);
	}
	
	@DeleteMapping("/{cartItemId}")
	public boolean removeCartItem(Long cartItemId) {
		return cart.removeCartItem(cartItemId);
	}
}