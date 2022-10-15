package com.learning.springweb.Rest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import com.learning.springweb.Rest.model.Product;

@SpringBootTest
class ProductRestApiApplicationTests {

	@Value("${restcontroller-uri}")
	String baseUrl;
	
	@Test
	void restTemplateTest() {
		RestTemplate restTemplate = new RestTemplate();
		Product product = restTemplate.getForObject(baseUrl+"/4", Product.class);
		System.out.println("> " + product);
	}
	
	@Test
	public void createRestTemplate() {
		RestTemplate restTemplate= new RestTemplate();
		Product product = new Product();
		product.setId(9);
		product.setName("T-Shirt");
		product.setDescription("Nice");
		product.setPrice(500);
		
		Product object = restTemplate.postForObject(baseUrl, product, Product.class);
		assertNotNull(object);
	}

}
