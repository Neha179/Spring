package com.ibm.ex9;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class TestExchange {
	@Test
	public void testConfig() {
		ApplicationContext ac = new AnnotationConfigApplicationContext(ExchangeConfig.class);
		 
		ExchangeService ex = (ExchangeService) ac.getBean("exchange");
		ex.convert();
	}

}
