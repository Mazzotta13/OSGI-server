package com.alessio.service.impl;

import com.alessio.service.Greeting;

public class GreetingImpl implements Greeting {
	private final String name;
	
	public GreetingImpl(String name) {
		this.name = name;
	}

	@Override
	public String sayHello() {
		String hello = "hello "+name + "!";
		System.out.println(hello);
		return hello;
	}

	@Override
	public int testDouble(int number) {
		return 2*number;
	}

}
