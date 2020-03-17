package com.alessio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import com.alessio.service.Greeting;
import com.alessio.service.impl.GreetingImpl;

@RunWith(MockitoJUnitRunner.class)
public class ServiceTest {	
	@Test
	public void test() {
		Greeting greeting = new GreetingImpl("Alessio");
		Assert.assertEquals("hello Alessio!", greeting.sayHello());
	}

}
