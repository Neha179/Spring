package com.ibm.ex2;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Teststock {
	
	@Test
	public void testStock() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("ex1ctx3.xml");
		Stock s1 = (Stock) ac.getBean("stock");
		
		Stock s2 = (Stock) ac.getBean("stock");
	
		System.out.println(s1 == s2);
	}

}
