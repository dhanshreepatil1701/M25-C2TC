package org.tnsindia.junit5demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class FirstJunit5test {

	@Test
	//it will perform the testing on the method
	void test() {
		System.out.println("Hello everyone");
	}
	@Test
	@Disabled
	
	void display() {
		fail("Hello everyone");
	}
	

}
