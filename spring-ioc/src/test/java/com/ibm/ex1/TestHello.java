package com.ibm.ex1;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestHello {
	@Test
	public void testHello() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("ex1ctx2.xml");
		Hello h = (Hello) ac.getBean("hi");
		// h.setMessage("Happy weekend");
		System.out.println("Messgae : " + h.getMessage());
	}

}
