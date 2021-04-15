package com.ibm.ex4;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMessage1 {

	@Test
	public void testMessage() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("ex4ctx.xml");
		MessageProcessor proc = ac.getBean("mp", MessageProcessor.class);
		
		proc.process("sms", "9777886737", "Hey bud");
		proc.process("email", "xyz@gmail.com", "Hola Amigo!");
	}
}
