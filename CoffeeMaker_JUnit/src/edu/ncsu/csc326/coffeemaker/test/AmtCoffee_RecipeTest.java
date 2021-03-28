package edu.ncsu.csc326.coffeemaker.test;

import static org.junit.Assert.*;

import org.junit.Test;
import edu.ncsu.csc326.coffeemaker.Recipe;
import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;

public class AmtCoffee_RecipeTest {
	@Test
	public void testGetAmtCoffee() throws RecipeException ,NumberFormatException {

		String amtCoffee = "10" ;
		double actual = 0 ;
		double expected = 10 ;
		
		Recipe objRecipe = new Recipe() ;
		objRecipe.setAmtCoffee(amtCoffee);
		actual = objRecipe.getAmtCoffee();
		
		assertTrue(expected == actual);
	}
	
	@Test(expected = RecipeException.class)
	public void testSetAmtCoffee1() throws RecipeException , NumberFormatException {
	// enter negative integer 
		String amtCoffee = "-5" ;
		double actual = 0 ;
		double expected = 5 ;
		
		Recipe objRecipe = new Recipe() ;
		objRecipe.setAmtCoffee(amtCoffee);
		actual = objRecipe.getAmtCoffee();
		
		assertTrue(expected == actual);
	}
	
	
	@Test
	public void testSetAmtCoffee2() throws RecipeException , NumberFormatException {
	//enter  0 
		String amtCoffee = "0" ;
		double actual = 0 ;
		double expected = 0 ;
		
		Recipe objRecipe = new Recipe() ;
		objRecipe.setAmtCoffee(amtCoffee);
		actual = objRecipe.getAmtCoffee();
		
		assertTrue(expected == actual);
	}
	
	@Test
	public void testSetAmtCoffee3() throws RecipeException , NumberFormatException {
	//enter positive integer 
		String amtCoffee = "10" ;
		double actual = 0 ;
		double expected = 10 ;
		
		Recipe objRecipe = new Recipe() ;
		objRecipe.setAmtCoffee(amtCoffee);
		actual = objRecipe.getAmtCoffee();
		
		assertTrue(expected == actual);
	}
	
	@Test
	public void testSetAmtCoffee4() throws RecipeException , NumberFormatException{
	//enter positive float 
		String amtCoffee = "2.5" ;
		double actual = 0 ;
		double expected = 2.5 ;
		
		Recipe objRecipe = new Recipe() ;
		objRecipe.setAmtCoffee(amtCoffee);
		actual = objRecipe.getAmtCoffee();
		
		assertTrue(expected == actual);
	}
	
	@Test(expected = NumberFormatException.class)
	public void testSetAmtCoffee5() throws RecipeException , NumberFormatException {
	//enter string 
		String amtCoffee = "y" ;
		double actual = 0 ;
		double expected = 0 ;
		
		Recipe objRecipe = new Recipe() ;
		objRecipe.setAmtCoffee(amtCoffee);
		actual = objRecipe.getAmtCoffee();

		assertTrue(expected == actual);
	}
}
