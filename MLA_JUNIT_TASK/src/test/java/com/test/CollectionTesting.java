package com.test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CollectionTesting {

	@Test
	public void TestingCollection() {
		
		List<User> list = Arrays.asList(
				new User(101,"Sri","sri@gmail.com",2015,"Chennai"),
				new User(102,"Eswar","eswar@gmail.com",2025,"Erode"),
				new User(103,"Om","om@gmail.com",2018,"Coimbatore"),
				new User(104,"Kavi","kavi@gmail.com",2009,"Salem ")
				);
		
		List<User> ToBe = Arrays.asList(
				new User(101,"Sri","sri@gmail.com",2015,"Chennai"),
				new User(102,"Eswar","eswar@gmail.com",2025,"Erode"),
				new User(103,"Om","om@gmail.com",2018,"Coimbatore"),
				new User(104,"Kavi","kavi@gmail.com",2009,"Salem ")
				);
		
		assertThat(ToBe, is(list));
		
		assertThat(ToBe, hasItems(new User(104,"Kavi","kavi@gmail.com",2009,"Salem ")));
		
		assertThat(list.get(2).getEmail(), endsWith("@gmail.com"));
		
		assertThat(ToBe.size(), is(list.size()));
	}

}
