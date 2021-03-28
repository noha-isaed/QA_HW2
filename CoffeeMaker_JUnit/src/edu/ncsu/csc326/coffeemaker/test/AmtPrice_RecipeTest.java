package edu.ncsu.csc326.coffeemaker.test;
import static org.junit.Assert.*;
import org.junit.Test;
import edu.ncsu.csc326.coffeemaker.Recipe;
import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;

public class AmtPrice_RecipeTest {
	@Test
	public void testGetAmtPrice() throws RecipeException ,NumberFormatException {

		String amtPrice = "10" ;
		double actual = 0 ;
		double expected = 10 ;
		
		Recipe objRecipe = new Recipe() ;
		objRecipe.setPrice(amtPrice);
		actual = objRecipe.getPrice();
		
		assertTrue(expected == actual);
	}
	
	@Test(expected = RecipeException.class)
	public void testSetAmtPrice1() throws RecipeException , NumberFormatException {
	// enter negative integer 
		String amtPrice = "-5" ;
		double actual = 0 ;
		double expected = 5 ;
		
		Recipe objRecipe = new Recipe() ;
		objRecipe.setPrice(amtPrice);
		actual = objRecipe.getPrice();
		
		assertTrue(expected == actual);
	}
	
	
	@Test
	public void testSetAmtPrice2() throws RecipeException , NumberFormatException {
	//enter  0 
		String amtPrice = "0" ;
		double actual = 0 ;
		double expected = 0 ;
		
		Recipe objRecipe = new Recipe() ;
		objRecipe.setPrice(amtPrice);
		actual = objRecipe.getPrice();
		
		assertTrue(expected == actual);
	}
	
	@Test
	public void testSetAmtPrice3() throws RecipeException , NumberFormatException {
	//enter positive integer 
		String amtPrice = "10" ;
		double actual = 0 ;
		double expected = 10 ;
		
		Recipe objRecipe = new Recipe() ;
		objRecipe.setPrice(amtPrice);
		actual = objRecipe.getPrice();
		
		assertTrue(expected == actual);
	}
	
	@Test
	public void testSetAmtPrice4() throws RecipeException , NumberFormatException{
	//enter positive float 
		String amtPrice = "2.5" ;
		double actual = 0 ;
		double expected = 2.5 ;
		
		Recipe objRecipe = new Recipe() ;
		objRecipe.setPrice(amtPrice);
		actual = objRecipe.getPrice();
		
		assertTrue(expected == actual);
	}
	
	@Test(expected = NumberFormatException.class)
	public void testSetAmtPrice5() throws RecipeException , NumberFormatException {
	//enter string 
		String amtPrice = "y" ;
		double actual = 0 ;
		double expected = 0 ;
		
		Recipe objRecipe = new Recipe() ;
		objRecipe.setPrice(amtPrice);
		actual = objRecipe.getPrice();
		
		assertTrue(expected == actual);
	}
}
