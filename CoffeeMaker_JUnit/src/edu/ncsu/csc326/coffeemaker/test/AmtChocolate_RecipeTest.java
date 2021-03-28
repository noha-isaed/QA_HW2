package edu.ncsu.csc326.coffeemaker.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.ncsu.csc326.coffeemaker.Recipe;
import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;

public class AmtChocolate_RecipeTest {
	@Test
	public void testGetAmtChocolate() throws RecipeException ,NumberFormatException {


		String amtChococlate = "10" ;
		double actual = 0 ;
		double expected = 10 ;
		
		Recipe objRecipe = new Recipe() ;
		objRecipe.setAmtChocolate(amtChococlate);
		actual = objRecipe.getAmtChocolate();
		
		assertTrue(expected == actual);
	}
	
	@Test(expected = RecipeException.class)
	public void testSetAmtChocolate1() throws RecipeException , NumberFormatException {
	// enter negative number 
		String amtChococlate = "-5" ;
		double actual = 0 ;
		double expected = 0;
		
		Recipe objRecipe = new Recipe() ;
		objRecipe.setAmtChocolate(amtChococlate);
		actual = objRecipe.getAmtChocolate();
		
		assertTrue(expected == actual);
	}
	
	
	@Test
	public void testSetAmtChocolate2() throws RecipeException , NumberFormatException {
	//enter  0 
		String amtChococlate = "0" ;
		double actual = 0 ;
		double expected = 0 ;
		
		Recipe objRecipe = new Recipe() ;
		objRecipe.setAmtChocolate(amtChococlate);
		actual = objRecipe.getAmtChocolate();
		
		assertTrue(expected == actual);
	}
	
	@Test
	public void testSetAmtChocolate3() throws RecipeException , NumberFormatException {
	//enter positive integer 
		String amtChococlate = "10" ;
		double actual = 0 ;
		double expected = 10 ;
		
		Recipe objRecipe = new Recipe() ;
		objRecipe.setAmtChocolate(amtChococlate);
		actual = objRecipe.getAmtChocolate();
		
		assertTrue(expected == actual);
	}
	
	@Test
	public void testSetAmtChocolate4() throws RecipeException , NumberFormatException{
	//enter positive float 
		String amtChococlate = "2.5" ;
		double actual = 0.0 ;
		double expected = 2.5 ;
		
		Recipe objRecipe = new Recipe() ;
		objRecipe.setAmtChocolate(amtChococlate);
		actual = objRecipe.getAmtChocolate();
		
		assertTrue(expected == actual);
	}
	
	@Test(expected = NumberFormatException.class)
	public void testSetAmtChocolate5() throws RecipeException , NumberFormatException {
	//enter string 
		String amtChococlate = "y" ;
		double actual = 0 ;
		double expected = 0 ;
		
		Recipe objRecipe = new Recipe() ;
		objRecipe.setAmtChocolate(amtChococlate);
		actual = objRecipe.getAmtChocolate();
		System.out.print(actual);
		assertTrue(expected == actual);
	}
}
