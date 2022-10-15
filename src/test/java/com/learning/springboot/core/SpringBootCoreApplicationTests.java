package com.learning.springboot.core;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.learning.springboot.core.services.PaymentServiceImpl;

@SpringBootTest
class SpringBootCoreApplicationTests {

	@Autowired
	PaymentServiceImpl service;
	
	@Test
	void dependencyCheck() {
		assertNotNull(service.getPaymentDao());
	}

}
