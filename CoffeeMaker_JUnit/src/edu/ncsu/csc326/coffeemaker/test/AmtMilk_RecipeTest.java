package edu.ncsu.csc326.coffeemaker.test;

import static org.junit.Assert.*;

import org.junit.Test;
import edu.ncsu.csc326.coffeemaker.Recipe;
import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;

public class AmtMilk_RecipeTest {
	@Test
	public void testGetAmtMilk() throws RecipeException ,NumberFormatException {

		String amtMilk = "10" ;
		double actual = 0 ;
		double expected = 10 ;
		
		Recipe objRecipe = new Recipe() ;
		objRecipe.setAmtMilk(amtMilk);
		actual = objRecipe.getAmtMilk();
		
		assertTrue(expected == actual);
	}
	
	@Test(expected = RecipeException.class)
	public void testSetAmtMilk1() throws RecipeException , NumberFormatException {
	// enter negative integer 
		String amtMilk = "-5" ;
		double actual = 0 ;
		double expected = 5 ;
		
		Recipe objRecipe = new Recipe() ;
		objRecipe.setAmtMilk(amtMilk);
		actual = objRecipe.getAmtMilk();
		
		assertTrue(expected == actual);
	}
	
	
	@Test
	public void testSetAmtMilk2() throws RecipeException , NumberFormatException {
	//enter  0 
		String amtMilk = "0" ;
		double actual = 0 ;
		double expected = 0 ;
		
		Recipe objRecipe = new Recipe() ;
		objRecipe.setAmtMilk(amtMilk);
		actual = objRecipe.getAmtMilk();
		
		assertTrue(expected == actual);
	}
	
	@Test
	public void testSetAmtMilk3() throws RecipeException , NumberFormatException {
	//enter positive integer 
		String amtMilk = "10" ;
		double actual = 0 ;
		double expected = 10 ;
		
		Recipe objRecipe = new Recipe() ;
		objRecipe.setAmtMilk(amtMilk);
		actual = objRecipe.getAmtMilk();
		
		assertTrue(expected == actual);
	}
	
	@Test
	public void testSetAmtMilk4() throws RecipeException , NumberFormatException{
	//enter positive float 
		String amtMilk = "2.5" ;
		double actual = 0 ;
		double expected = 2.5 ;
		
		Recipe objRecipe = new Recipe() ;
		objRecipe.setAmtMilk(amtMilk);
		actual = objRecipe.getAmtMilk();
		
		assertTrue(expected == actual);
	}
	
	@Test(expected = NumberFormatException.class)
	public void testSetAmtMilk5() throws RecipeException , NumberFormatException {
	//enter string 
		String amtMilk = "y" ;
		double actual = 0 ;
		double expected = 0 ;
		
		Recipe objRecipe = new Recipe() ;
		objRecipe.setAmtMilk(amtMilk);
		actual = objRecipe.getAmtMilk();

		assertTrue(expected == actual);
	}
}
