package com.api.SportyShoes.repository;


import com.api.SportyShoes.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
	
	public Product findByProductName(String name);
	public Product findByDate(String date);
	public Product findByCategory(String category);
}