package edu.ncsu.csc326.coffeemaker.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.ncsu.csc326.coffeemaker.Recipe;
import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;

public class Name_RecipeTest {

	@Test
	public void testGetName() throws RecipeException {
		
		String name = "Chocolate Cake" ;
		String actual = "Chocolate Cake" ;
		String expected = "Chocolate Cake" ;
		
		Recipe objRecipe = new Recipe() ;
		objRecipe.setName(name);
		actual = objRecipe.getName();
		
		assertTrue(expected == actual);
		
	}

	@Test
	public void testSetName1() throws RecipeException {
		
		//enter string 
		String name = "Chocolate Cake" ;
		String actual = "Chocolate Cake" ;
		String expected = "Chocolate Cake" ;
		
		Recipe objRecipe = new Recipe() ;
		objRecipe.setName(name);
		actual = objRecipe.getName();
		
		assertTrue(expected == actual);
	}
	
	@Test (expected = RecipeException.class)
	public void testSetName2()  throws RecipeException{
		
		//enter null
		String name = null ;
		String actual = "Chocolate Cake" ;
		String expected = "" ;
		
		Recipe objRecipe = new Recipe() ;
		objRecipe.setName(name);
		actual = objRecipe.getName();
		
		assertTrue(expected == actual);
	}

}
