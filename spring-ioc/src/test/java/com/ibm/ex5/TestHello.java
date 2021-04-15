package com.ibm.ex5;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ibm.ex5.Hello;

public class TestHello {

	@Test
	public void testHello() {
		//ApplicationContext ac = new ClassPathXmlApplicationContext("ex5ctx5.xml");
		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("ex5tcx5.xml");
		Hello h = (Hello) ctx.getBean("hi");
		// h.setMessage("Happy weekend");
		
		System.out.println("Messgae : " + h.getMessage());
	}
}
