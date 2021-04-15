package com.ibm.ex4;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MessageProcessor implements ApplicationContextAware{

	private ApplicationContext ac;
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.ac = applicationContext;
		System.out.println("Application context injected ");
		
	}
	
	public MessageProcessor() {
		System.out.println("MessageProcessor Constructor");
	}
	
	public void process(String type, String to, String msg) {
		Message m = ac.getBean(type, Message.class);
		m.send(to, msg);
	}

	
}
