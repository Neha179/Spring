package com.ibm.ex3;

import org.junit.jupiter.api.Test;
//import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMyLife {

	
	@Test
	public void testLife() {
		ConfigurableApplicationContext ac = new ClassPathXmlApplicationContext("ex3ctx.xml");
		MyLife life = (MyLife) ac.getBean(MyLife.class);
		
		ac.close();
		
	}
	
}
