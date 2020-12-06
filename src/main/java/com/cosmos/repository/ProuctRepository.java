package com.cosmos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cosmos.model.Product;

public interface ProuctRepository extends JpaRepository<Product, Integer>{

	@Query("SELECT c FROM Product c WHERE c.active = true")
	public List<Product> findAllEnabled();
	@Query("SELECT c FROM Product c WHERE c.active = false")
	public List<Product> findAllDissabled();
}
