package edu.ncsu.csc326.coffeemaker.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.ncsu.csc326.coffeemaker.Recipe;
import edu.ncsu.csc326.coffeemaker.RecipeBook;
import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;

public class DeleteRecipe_RecipeBookTest {

	@Test
	public void testDeleteRecipe1() throws RecipeException {
		
     // delete recipe exist
		String expectedName = "Milkshake Chocolate";
		
		Recipe recipe =  new Recipe() ;
		RecipeBook recipeBook =  new RecipeBook() ;
		
		recipe.setName("Milkshake Chocolate");
		recipe.setAmtChocolate("1.5");
		recipe.setAmtCoffee("0.5");
		recipe.setAmtMilk("2");
		recipe.setAmtSugar("1");
		recipe.setPrice("15");
		
		 recipeBook.addRecipe(recipe);
		 
		 String actualName = recipeBook.deleteRecipe(0);
		
		assertTrue(actualName == expectedName);	
	}
	

	@Test
	public void testDeleteRecipe2() throws RecipeException {
		
      // delete from null place
		String expectedName = null;
		
		RecipeBook recipeBook =  new RecipeBook() ;
				 
		String actualName = recipeBook.deleteRecipe(2);
		
		assertTrue(actualName == expectedName);	
	}

	@Test(expected =ArrayIndexOutOfBoundsException.class )
	public void testDeleteRecipe3() throws RecipeException {
      // delete from index out of range
		String expectedName = null;
		
		RecipeBook recipeBook =  new RecipeBook() ;
				 
		String actualName = recipeBook.deleteRecipe(4);
		
		assertTrue(actualName == expectedName);	
	}
}
