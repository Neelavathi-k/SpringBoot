package com.learning.springboot.core;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Assignment01ApplicationTests {

	@Autowired
	Calculation calc;
	
	@Test
	void sumTest() {
		calc.sum(5, 4);
	}

}
