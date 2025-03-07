package com.test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.hamcrest.collection.IsEmptyCollection;
import org.junit.jupiter.api.Test;

public class CollectionTest {
	
	@Test
	public void testListOfNumbers() {
		
		List<Integer> list = Arrays.asList(10,12,14,16,18,20);
		List<Integer> expected = Arrays.asList(10,12,14,16,18,20);
		
//		assertEquals(expected, list);
		
//		assertThat(list, is(expected));
		
//		assertThat(list, hasItems(14));
		
//		assertThat(list.size(),is(6));
		
//		assertThat(list, IsEmptyCollection.empty());
		
//		assertThat(list, );
		
		
		

	}
	
	@Test
	public void testFruit() {
		List<Fruits> AList = Arrays.asList(
				new Fruits("Guava",85),
				new Fruits("Banana",10),
				new Fruits("Apple",120));
		
		assertThat(AList, hasItems(new Fruits("Apple",120)));
	}
}
