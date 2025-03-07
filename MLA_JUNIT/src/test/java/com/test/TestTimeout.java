package com.test;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.suite.api.IncludeClassNamePatterns;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
@Timeout(value = 5, unit = TimeUnit.SECONDS)
@Suite
//@SelectPackages("com.test")
@DisplayName("Tes___Suite")
//@IncludeClassNamePatterns("Test.*")
@SelectClasses(TestTimeout.class)
public class TestTimeout {
	Calculator obj;
	
@Test
@Timeout(value = 5, unit = TimeUnit.SECONDS)
public void testAdd() {
	try {
		TimeUnit.SECONDS.sleep(5);
	}catch(Exception e) {
		e.printStackTrace();
	}
	
	
		
		
		
	}
@ParameterizedTest
@ValueSource(ints = {1,2,3,4,5})
public void testArgu(int args) {
	int x =5;
	int sum = x + args;
	System.out.println(sum);

}
}
