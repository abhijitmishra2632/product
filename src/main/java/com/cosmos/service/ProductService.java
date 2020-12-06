package com.cosmos.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cosmos.model.Product;
import com.cosmos.repository.ProuctRepository;

@Service
public class ProductService {
	@Autowired
	private ProuctRepository productRepository;
	/*
	 * @Autowired private Category category;
	 */

	public Product saveProduct(Product product) {
		product.setActive(true);
		product.setNow(LocalDate.now());
		return productRepository.save(product);
	}

	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return productRepository.findAllEnabled();
	}

	public Product updateProduct(int productId, Product product) {
		System.out.println("Inside product update");
		return productRepository.save(product);
	}

	public Product cloneProduct(Product product) {
		System.out.println(product.toString());
		product.setProductId(0);
		product.setNow(LocalDate.now());
		return productRepository.save(product);
	}

	public String deleteProduct(int productId) {
		// TODO Auto-generated method stub
		
		Product product = productRepository.findById(productId).get();
		product.setActive(false);
		productRepository.save(product);
		String response = "Successfully Deleted the product "+product.getProductName() +". It will be available in DB till 30 days incase u want to use in future";
		return response;
	}

	public Optional<Product> getProductById(int productId) {
		// TODO Auto-generated method stub
		return productRepository.findById(productId);
	}

	public List<Product> getAllDeletedProducts() {
		// TODO Auto-generated method stub
		return productRepository.findAllDissabled();
	}

	public String undoProduct(int productId) {
		// TODO Auto-generated method stub
		Product product = productRepository.findById(productId).get();
		product.setActive(true);
		productRepository.save(product);
		String response = "Successfully undone the product "+product.getProductName() ;
		return response;
	}

}
