package com.ibm.ex4;

public class TestMessage implements Message {
	public TestMessage() {
		System.out.println("SMS Message");
	}
	@Override
	public void send(String to, String msg) {
		System.out.println("Text sent to " + to + "as" + msg);
	}

}
