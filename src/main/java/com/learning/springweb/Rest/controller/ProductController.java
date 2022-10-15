package com.learning.springweb.Rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.learning.springweb.Rest.Repo.ProductRepository;
import com.learning.springweb.Rest.model.Product;

@RestController
public class ProductController {

	@Autowired
	ProductRepository repository;
	
	@RequestMapping(value="/products", method = RequestMethod.GET)
	public List<Product> getProducts() {
		System.out.println("Inside product");
		return repository.findAll();
	}

	@RequestMapping(value="/products/{id}", method=RequestMethod.GET)
	@Transactional(readOnly = true)
	@Cacheable("cache")
	public Product getProduct(@PathVariable("id") int id) {
		return repository.findById(id).get();
	}
	
//	@RequestMapping(value="/createproducts", method=RequestMethod.POST)
//	public int createProduct(@RequestBody Product product) {
//		return repository.create(product);
//	}
	
	@RequestMapping(value="/products", method=RequestMethod.POST)
	public Product createProduct(@RequestBody Product product) {
		return repository.save(product);
	}
	
	@RequestMapping(value="/products", method=RequestMethod.PUT)
	public Product updateProduct(@RequestBody Product product) {
		return repository.save(product);
	}
	
	@RequestMapping(value="/products/{id}", method=RequestMethod.DELETE)
	@CacheEvict("cache")
	public void deleteProduct(@PathVariable("id") int id) {
		repository.deleteById(id);
	}
}
