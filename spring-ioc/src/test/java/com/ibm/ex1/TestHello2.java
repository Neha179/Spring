package com.ibm.ex1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "classpath:ex1ctx.xml")
public class TestHello2 {
	
	@Autowired
	@Qualifier("hi")
	private Hello hi;
	
	@Test
	public void testHello() {
	//	ApplicationContext ac = new ClassPathXmlApplicationContext("ex1ctx2.xml");
	//	Hello h = (Hello) ac.getBean("hi");
		// h.setMessage("Happy weekend");
		System.out.println("Messgae : " + hi.getMessage());
	}

}