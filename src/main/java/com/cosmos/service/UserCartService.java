package com.cosmos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cosmos.model.Item;
import com.cosmos.model.UserCart;
import com.cosmos.repository.UserCartRepository;

@Service
public class UserCartService {
	@Autowired
	private UserCartRepository userCartRepository;

	public UserCart getUserCart(Long mobileNumber) {
		// TODO Auto-generated method stub
		UserCart cart=userCartRepository.findById(mobileNumber).get();
		System.out.println(cart.getItems().toString());
		System.out.println(cart);
		return cart;
	}

	public UserCart saveUserCart(UserCart userCart) {
		// TODO Auto-generated method stub
		for(Item item:userCart.getItems()) {
			item.setCart(userCart);
		}
		return userCartRepository.save(userCart);
	}

}
