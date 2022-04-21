package com.simplilearn.demo;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.util.Date;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AddTest {

	@Autowired
	EProductDAO eproductDAO;

	//@Disabled
	@Test
	void test() {
		EProductEntity entity= new EProductEntity();
		entity.setID(11);
		entity.setName("LENOVO thinkpad");
		entity.setPrice(new BigDecimal(100000));
		entity.setDateAdded(new Date());
		int x=eproductDAO.addProduct(entity);
		assertEquals(1, x);
	}
	
	@Test
	void findTest() {
		EProductEntity entity= eproductDAO.getByName("Acer Laptop ABC");
		System.out.println(entity);
		assertNotNull(entity); 
	}
	@Test
	void findTest2() {
		EProductEntity entity= eproductDAO.getByName("Test Laptop ABC");
		System.out.println(entity);
		assertNull(entity); 
	}

}
