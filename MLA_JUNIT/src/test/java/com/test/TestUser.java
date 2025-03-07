package com.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Rule;
import org.junit.Test;
import org.junit.jupiter.api.function.Executable;
import org.junit.rules.ExpectedException;

public class TestUser {
//JUNIT5 Exception testing method
	@Test
	public void testUserName() {
		
		assertThrows(IllegalArgumentException.class,new Executable() {
			

			@Override
			public void execute() throws Throwable {
				// TODO Auto-generated method stub
			
				User data = new User();
				data.setName(null);
			}
		} );
		
		
	}
	@Test
	public void testNameIsNull() {
		
		Throwable exception = assertThrows(IllegalArgumentException.class, ()->{
			User obj = new User();
			obj.setName(null);
		});
		System.out.println(exception.getMessage());
		assertEquals("Please enter your name...!", exception.getMessage());
		
	}
	
	@Rule
	public ExpectedException exception = ExpectedException.none();
	
	@Test(expected = IllegalArgumentException.class)
	public void testNameValues() {
		User obj = new User();
		
		obj.setName(null);
		
	}
	
}
