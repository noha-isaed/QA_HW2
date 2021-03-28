package edu.ncsu.csc326.coffeemaker.test;

import static org.junit.Assert.*;

import org.junit.Test;
import edu.ncsu.csc326.coffeemaker.Recipe;
import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;

public class AmtSugar_RecipeTest {
	@Test
	public void testGetAmtSugar() throws RecipeException ,NumberFormatException {

		String amtSugar = "10" ;
		double actual = 0 ;
		double expected = 10 ;
		
		Recipe objRecipe = new Recipe() ;
		objRecipe.setAmtSugar(amtSugar);
		actual = objRecipe.getAmtSugar();
		
		assertTrue(expected == actual);
	}
	
	@Test(expected = RecipeException.class)
	public void testSetAmtSugar1() throws RecipeException , NumberFormatException {
	// enter negative integer 
		String amtSugar = "-5" ;
		double actual = 0 ;
		double expected = 5 ;
		
		Recipe objRecipe = new Recipe() ;
		objRecipe.setAmtSugar(amtSugar);
		actual = objRecipe.getAmtSugar();
		
		assertTrue(expected == actual);
	}
	
	
	@Test
	public void testSetAmtSugar2() throws RecipeException , NumberFormatException {
	//enter  0 
		String amtSugar = "0" ;
		double actual = 0 ;
		double expected = 0 ;
		
		Recipe objRecipe = new Recipe() ;
		objRecipe.setAmtSugar(amtSugar);
		actual = objRecipe.getAmtSugar();
		
		assertTrue(expected == actual);
	}
	
	@Test
	public void testSetAmtSugar3() throws RecipeException , NumberFormatException {
	//enter positive integer 
		String amtSugar = "10" ;
		double actual = 0 ;
		double expected = 10 ;
		
		Recipe objRecipe = new Recipe() ;
		objRecipe.setAmtSugar(amtSugar);
		actual = objRecipe.getAmtSugar();
		
		assertTrue(expected == actual);
	}
	
	@Test
	public void testSetAmtSugar4() throws RecipeException , NumberFormatException{
	//enter positive float 
		String amtSugar = "2.5" ;
		double actual = 0 ;
		double expected = 2.5 ;
		
		Recipe objRecipe = new Recipe() ;
		objRecipe.setAmtSugar(amtSugar);
		actual = objRecipe.getAmtSugar();
		
		assertTrue(expected == actual);
	}
	
	@Test(expected = NumberFormatException.class)
	public void testSetAmtSugar5() throws RecipeException , NumberFormatException {
	//enter string 
		String amtSugar = "y" ;
		double actual = 0 ;
		double expected = 0 ;
		
		Recipe objRecipe = new Recipe() ;
		objRecipe.setAmtSugar(amtSugar);
		actual = objRecipe.getAmtSugar();

		assertTrue(expected == actual);
	}
}
