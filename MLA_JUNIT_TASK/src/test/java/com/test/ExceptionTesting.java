package com.test;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

public class ExceptionTesting {
	User obj;

	@BeforeClass
	public static void Beforeclass() {

	}

	@Before
	public void setUp() {

		obj = new User(101, "Avan", "avan@gmail.com", 2025, "Ooru");

	}

	@org.junit.Test
	public void TestingEmail() {

		assertThrows(IllegalStateException.class,new Executable() {
			
			@Override
			public void execute() throws Throwable {
				// TODO Auto-generated method stub
				User o = new User();
				o.setEmail("hrstgbrt");
				
			}
		});
	}

	@After
	public void setDown() {

	}

	@AfterClass
	public static void Afterclass() {

	}
}
