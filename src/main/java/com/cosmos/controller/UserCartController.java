package com.cosmos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cosmos.model.UserCart;
import com.cosmos.service.UserCartService;

@RestController
@RequestMapping("/cart")
public class UserCartController {
	@Autowired
	private UserCartService userCartService;
	@GetMapping("/{mobileNumber}")
	public UserCart getUserCart(@PathVariable Long mobileNumber) {
		return userCartService.getUserCart(mobileNumber);
	}
	@PostMapping
	public UserCart saveUserCart(@RequestBody UserCart userCart) {
		return userCartService.saveUserCart(userCart);
	}

}
