package com.learning.springboot.core;

import org.springframework.stereotype.Component;

@Component
public class Calculation {

	public void sum(int x, int y) {
		System.out.println("Sum :: " + (x+y));
	}
}
