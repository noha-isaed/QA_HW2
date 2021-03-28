package edu.ncsu.csc326.coffeemaker.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.ncsu.csc326.coffeemaker.Recipe;
import edu.ncsu.csc326.coffeemaker.RecipeBook;
import edu.ncsu.csc326.coffeemaker.exceptions.RecipeException;

public class AddRecipe_RecipeBookTest {

	@Test
	public void testAddRecipe() throws RecipeException {
		// not exist and added
		
		boolean expectedAdded = true;
		
		Recipe recipe =  new Recipe() ;
		RecipeBook recipeBook =  new RecipeBook() ;
		
		recipe.setName("Milkshake Chocolate");
		recipe.setAmtChocolate("1.5");
		recipe.setAmtCoffee("0.5");
		recipe.setAmtMilk("2");
		recipe.setAmtSugar("1");
		recipe.setPrice("15");
		
		boolean actualAdded = recipeBook.addRecipe(recipe);
		
		assertTrue(actualAdded == expectedAdded);	
	
	}

	@Test
	public void testAddRecipe2() throws RecipeException {
		
		//  exist and not added

		boolean expectedAdded = false;
		RecipeBook recipeBook =  new RecipeBook() ;

		Recipe recipe =  new Recipe() ;
		recipe.setName("Milkshake Chocolate");
		recipe.setAmtChocolate("1.5");
		recipe.setAmtCoffee("0.5");
		recipe.setAmtMilk("2");
		recipe.setAmtSugar("1");
		recipe.setPrice("15");
		
		recipeBook.addRecipe(recipe);
		
		Recipe recipe2 =  new Recipe() ;
		recipe2.setName("Milkshake Chocolate");
		recipe2.setAmtChocolate("1.5");
		recipe2.setAmtCoffee("0.5");
		recipe2.setAmtMilk("2");
		recipe2.setAmtSugar("1");
		recipe2.setPrice("15");
		
		boolean actualAdded = recipeBook.addRecipe(recipe2);

		assertTrue(actualAdded == expectedAdded);	
	
	}
	
	@Test
	public void testAddRecipe3() throws RecipeException {
		
		//  the array is fill

		boolean expectedAdded = false;
		RecipeBook recipeBook =  new RecipeBook() ;

		Recipe recipe1 =  new Recipe() ;
		recipe1.setName("Milkshake Chocolate");
		recipe1.setAmtChocolate("1.5");
		recipe1.setAmtCoffee("0.5");
		recipe1.setAmtMilk("2");
		recipe1.setAmtSugar("1");
		recipe1.setPrice("15");
		
		recipeBook.addRecipe(recipe1);
		
		Recipe recipe2 =  new Recipe() ;
		recipe2.setName("Chocolate Cake");
		recipe2.setAmtChocolate("2");
		recipe2.setAmtCoffee("1");
		recipe2.setAmtMilk("3");
		recipe2.setAmtSugar("2");
		recipe2.setPrice("30");
		
		recipeBook.addRecipe(recipe2);
		
		Recipe recipe3 =  new Recipe() ;
		recipe3.setName("Chocolate Balls");
		recipe3.setAmtChocolate("1");
		recipe3.setAmtCoffee("0.5");
		recipe3.setAmtMilk("0.5");
		recipe3.setAmtSugar("1");
		recipe3.setPrice("10");
		
		recipeBook.addRecipe(recipe3);

		Recipe recipe4 =  new Recipe() ;
		recipe4.setName("Coofee Cake");
		recipe4.setAmtChocolate("0.5");
		recipe4.setAmtCoffee("2");
		recipe4.setAmtMilk("1");
		recipe4.setAmtSugar("1");
		recipe4.setPrice("20");
		
		recipeBook.addRecipe(recipe4);

		Recipe recipe5 =  new Recipe() ;
		recipe5.setName("Coffee & Chocolate Cake");
		recipe5.setAmtChocolate("1");
		recipe5.setAmtCoffee("1");
		recipe5.setAmtMilk("2");
		recipe5.setAmtSugar("1");
		recipe5.setPrice("25");
		
		boolean actualAdded = recipeBook.addRecipe(recipe5);

		assertTrue(actualAdded == expectedAdded);	
	
	}
}
