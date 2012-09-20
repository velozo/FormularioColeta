package br.com.petrobras;

import junit.framework.Assert;

import org.junit.Test;

public class HelloServiceTest {
	
	@Test
	public void testSayHello() {
		HelloService instance = HelloService.getInstance();
		Assert.assertNotNull(instance);
		instance.sayHello("hello");
	}

}
