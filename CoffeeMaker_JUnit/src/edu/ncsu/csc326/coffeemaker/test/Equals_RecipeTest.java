package edu.ncsu.csc326.coffeemaker.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.ncsu.csc326.coffeemaker.Recipe;

public class Equals_RecipeTest {

	@Test
	public void testEqualsObject1() {
		//enter  object from Object class 
		boolean actual = true ;
		boolean expected = false ;

		Object obj = new Object();
		Recipe rec = new Recipe();
		actual = rec.equals(obj);
		
		assertTrue(expected == actual);
	
	}
	
	@Test
	public void testEqualsObject2() {
		//enter  object from Object class 
		boolean actual = true ;
		boolean expected = true ;

		Recipe rec1 = new Recipe();
		Recipe rec2 = new Recipe();
		actual = rec1.equals(rec2);
		
		assertTrue(expected == actual);
	
	}

	@Test
	public void testEqualsObject3() {
		//enter  object from Object class 
		boolean actual = true ;
		boolean expected = false ;

		Object obj = null;
		Recipe rec2 = new Recipe();
		actual = rec2.equals(obj);
		
		assertTrue(expected == actual);
	
	}
}
