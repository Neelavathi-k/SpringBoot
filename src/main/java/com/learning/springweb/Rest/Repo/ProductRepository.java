package com.learning.springweb.Rest.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.learning.springweb.Rest.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

//public interface ProductRepository {
//	
//	int create(Product product);
}
