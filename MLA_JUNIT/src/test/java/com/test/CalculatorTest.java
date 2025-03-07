package com.test;



import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.runners.Parameterized.Parameters;

public class CalculatorTest {

	Calculator obj;
	Register reg;
	 static int x;
	 static int y;
	@BeforeClass
	public static void beforeClass() {
		System.out.println("BEFORE ALL THE TEST CASES ONLY ONE TIME");
		
		x =10;
		y=23;
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("AFTER ALL THE TEST CASES ONLY ONE TIME");
		
		
		
	}

	@Before
	public void setUp() {
		System.out.println("excutees every test method before excution");
		obj = new Calculator();
		reg =  new Register();
	}

	@After
	public void setDown() {
		System.out.println("excutes every test method after excution");
		obj = null;
		reg = null;
	}

	@Test
	@Timeout(value = 3, unit = TimeUnit.SECONDS )
	public void TestAdd() {
		System.out.println("TestAdd Method");
		int res = obj.add(y, x);
		assertEquals(33,res);
		try {
			TimeUnit.SECONDS.sleep(5);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void TestSub() {
		System.out.println("TestSub Method");
		int res = obj.sub(y, x);
		assertEquals(13,res);
		
	}

	@Test
	public void TestMul() {
		System.out.println("TestMul Method");
		
		int res = obj.mul(y, x);
		assertEquals(230, res);
	}

	@Test
	public void TestGreet() {
		System.out.println("TestGreet Method");
		
		assertEquals("logic testing", obj.greet("logic testing"));
	}
	
	@Test 
	public void TestReg() {
		String str = reg.GreetUser(true);
		System.out.println(str);
		assertEquals("Welcome to our site", reg.GreetUser(true));
	}
	
	
}
