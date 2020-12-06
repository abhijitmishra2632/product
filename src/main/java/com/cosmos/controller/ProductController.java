package com.cosmos.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cosmos.model.Product;
import com.cosmos.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@GetMapping("/deleted")
	public List<Product> getAllDeletedProducts(){
		return productService.getAllDeletedProducts();
	}
	@GetMapping("/{productId}")
	public Optional<Product> getProductById(@PathVariable int productId) {
		return productService.getProductById(productId);
	}
	@GetMapping
	public List<Product> getAllProducts(){
		return productService.getAllProducts();
	}
	
	@PostMapping
	public Product saveProduct(@RequestBody Product product) {
		return productService.saveProduct(product);
	}
	@PutMapping("/update/{productId}")
	public Product updateProduct(@PathVariable int productId,@RequestBody Product product) {
		return productService.updateProduct(productId,product);
	}
	@PostMapping("/clone")
	public Product cloneProduct(@RequestBody Product product) {
		return productService.cloneProduct(product);
	}
	@DeleteMapping("/{productId}")
	public String deleteProduct(@PathVariable int productId) {
		return productService.deleteProduct(productId);
	}
	@DeleteMapping("/undo/{productId}")
	public String undoProduct(@PathVariable int productId) {
		return productService.undoProduct(productId);
	}
}
